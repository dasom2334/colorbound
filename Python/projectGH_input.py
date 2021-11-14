
# coding: utf-8

# In[1]:


from PIL import Image
import numpy as np
import matplotlib.pyplot as plt
import os 
from sklearn.cluster import KMeans
import sklearn.cluster.k_means_
import pymysql
import json
import math


colorList = json.load(open('c:\\test.json'))


# In[2]:


def RGBtoHEX(r, g, b) :
    result = '#%02x%02x%02x' % (int(r), int(g), int(b))
    return result


# In[3]:


def HEXtoRGB(hEx) :
    rgb = [0,0,0]
    h = hEx.split('#')[1]
    rgb[0] = int(h[0:2], 16)
    rgb[1] = int(h[2:4], 16)
    rgb[2] = int(h[4:6], 16)
    return rgb


# In[4]:


def nameConverter(r, g, b):
    r = int(r)
    g = int(g)
    b = int(b)
    minest = 500
    crrectColor = {}
    for i in colorList :
        R = i.get("R")
        G = i.get("G")
        B = i.get("B")
        
        distance = (r-R)*(r-R) + (g-G)*(g-G) + (b-B)*(b-B)
        distance = math.sqrt(distance)
        if minest>distance :
            minest = distance
            crrectColor = i
            
    return crrectColor


# In[5]:


path_dir = 'C:\\KDS\\van_gogh'
file_path = os.listdir(path_dir)

file_list = []
for i in file_path :
    file_list.append(i.split('.')[0])    


# In[6]:


def elbow(X):
    sse = []
    a = []
    for i in range(3, 11):
        km = KMeans(n_clusters=i, init='k-means++', random_state=0)
        km.fit(X)
        sse.append(km.inertia_)
    b=0

    for j in range(len(sse)):  
        a.append((sse[j]-sse[j-1])) 
        c = abs(a[j-1])-abs(a[j])
        if a[j]>a[j-1] :
            if b<c :
                b=c
                global d
                d=j+3
    return d


# In[7]:


def mysql(name, colors):
    conn = pymysql.connect(host='localhost', user='root', password='248624', db='project', charset='utf8', autocommit=True)

    try :  
        curs = conn.cursor()
        sql = "INSERT INTO `gogh`(`name`, `colors`) VALUES (%s,%s)"
        curs.execute(sql, (name, colors))
    except MySQLError as err:
        print(err)  
    finally :
        conn.close()


# In[11]:


def input_cluster(filename):    
    #filename = "C:\\KDS\\imgs\\1MBFDUHLZ4.jpg"
    im = Image.open("C:\\KDS\\van_gogh\\"+filename+".jpg")
    gh = np.array(im)   
    kluer =[]
    realColor = []
    for i in gh :
        if im.size[0]>im.size[1]:
            for j in range(0, im.size[1]) :
                kluer.append(str(i[j, 0])+" "+str(i[j, 1])+" "+str(i[j, 2]))
        else :
            for j in range(0, im.size[0]) :
                kluer.append(str(i[j, 0])+" "+str(i[j, 1])+" "+str(i[j, 2]))
    kluer = list(set(kluer))
    
    for i in kluer :
        realColor.append([i.split(' ')[0], i.split(' ')[1], i.split(' ')[2]])
        
    d =elbow(realColor)*10
    e = KMeans(n_clusters=d, init='k-means++', random_state=0).fit(realColor).cluster_centers_
    
    e_2 = []
    for i in e:
        a = nameConverter(i[0], i[1], i[2])
        e_2.append(str(a.get("R"))+" "+str(a.get("G"))+" "+str(a.get("B")))

    e_2 = list(set(e_2))
    e = []
    for i in e_2:
        e.append([int(i.split(' ')[0]), int(i.split(' ')[1]), int(i.split(' ')[2])])
    
    d = len(e)
    e = np.asarray(e)
    
    color = []
    for a in range(len(e)):         
        color.append(RGBtoHEX(e[a, 0], e[a, 1], e[a, 2]))
                     
    colors = ""
                     
    for i in color :
        colors = colors+i+" "
    mysql(filename, colors)


# In[12]:


num = 1
for i in file_list :
    input_cluster(i)
    print(num)
    print(i)
    num = num+1

