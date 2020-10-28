# SerialGC
## -Xms128m -Xmx128m

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 22:55:19
[Press C to stop the test]
178471  (RPS: 2727.9)
---------------Finished!----------------
Finished at 2020/10/28 22:56:24 (took 00:01:05.5363760)
Status 200:    178472

RPS: 2921.2 (requests/second)
Max: 108ms
Min: 0ms
Avg: 1.1ms

  50%   below 0ms
  60%   below 0ms
  70%   below 1ms
  80%   below 2ms
  90%   below 4ms
  95%   below 5ms
  98%   below 8ms
  99%   below 10ms
99.9%   below 25ms
```

---

## -Xms512m -Xmx512m

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 22:58:45
[Press C to stop the test]
184118  (RPS: 2818.6)
---------------Finished!----------------
Finished at 2020/10/28 22:59:50 (took 00:01:05.4453578)
Status 200:    184118

RPS: 3012.9 (requests/second)
Max: 94ms
Min: 0ms
Avg: 2.6ms

  50%   below 2ms
  60%   below 3ms
  70%   below 3ms
  80%   below 4ms
  90%   below 6ms
  95%   below 8ms
  98%   below 11ms
  99%   below 15ms
99.9%   below 34ms
```

---

## -Xms1g -Xmx1g

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:01:24
[Press C to stop the test]
154966  (RPS: 2365.2)
---------------Finished!----------------
Finished at 2020/10/28 23:02:29 (took 00:01:05.6884765)
Status 200:    154975

RPS: 2534.5 (requests/second)
Max: 100ms
Min: 0ms
Avg: 0.6ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 1ms
  90%   below 2ms
  95%   below 4ms
  98%   below 6ms
  99%   below 7ms
99.9%   below 15ms
```

---


## -Xms4g -Xmx4g

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:04:24
[Press C to stop the test]
163799  (RPS: 2503.6)
---------------Finished!----------------
Finished at 2020/10/28 23:05:30 (took 00:01:05.6697003)
Status 200:    163888

RPS: 2678 (requests/second)
Max: 139ms
Min: 0ms
Avg: 2ms

  50%   below 1ms
  60%   below 2ms
  70%   below 3ms
  80%   below 3ms
  90%   below 5ms
  95%   below 7ms
  98%   below 10ms
  99%   below 13ms
99.9%   below 28ms
```

SerialGC在512m时吞吐量较好，但平均响应延迟较高  
在1g时平均响应延迟较好，但吞吐量较小

---

# ParallelGC
## -Xms128m -Xmx128m

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:06:58
[Press C to stop the test]
140634  (RPS: 2146.9)
---------------Finished!----------------
Finished at 2020/10/28 23:08:04 (took 00:01:05.5973714)
Status 200:    140663

RPS: 2303.4 (requests/second)
Max: 98ms
Min: 0ms
Avg: 0.5ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 1ms
  95%   below 3ms
  98%   below 5ms
  99%   below 7ms
99.9%   below 14ms
```

---


## -Xms512m -Xmx512m

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:10:31
[Press C to stop the test]
156773  (RPS: 2399.6)
---------------Finished!----------------
Finished at 2020/10/28 23:11:37 (took 00:01:05.5203769)
Status 200:    156776

RPS: 2562.5 (requests/second)
Max: 1094ms
Min: 0ms
Avg: 0.9ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 1ms
  90%   below 3ms
  95%   below 4ms
  98%   below 7ms
  99%   below 9ms
99.9%   below 21ms
```

---

## -Xms1g -Xmx1g

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:12:21
[Press C to stop the test]
155921  (RPS: 2367)
---------------Finished!----------------
Finished at 2020/10/28 23:13:27 (took 00:01:06.0819144)
Status 200:    155922

RPS: 2548 (requests/second)
Max: 90ms
Min: 0ms
Avg: 0.4ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 1ms
  95%   below 3ms
  98%   below 5ms
  99%   below 7ms
99.9%   below 13ms
```

---


## -Xms4g -Xmx4g

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:14:07
[Press C to stop the test]
181969  (RPS: 2781.3)
---------------Finished!----------------
Finished at 2020/10/28 23:15:13 (took 00:01:05.6078174)
Status 200:    181969

RPS: 2974.4 (requests/second)
Max: 92ms
Min: 0ms
Avg: 3.6ms

  50%   below 3ms
  60%   below 3ms
  70%   below 4ms
  80%   below 5ms
  90%   below 7ms
  95%   below 9ms
  98%   below 14ms
  99%   below 18ms
99.9%   below 33ms
```

ParallelGC在4g时吞吐量较好，但平均响应延迟较高  
在1g时平均响应延迟较好，吞吐量普通

---

# ConcMarkSweepGC
## -Xms128m -Xmx128m

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:15:58
[Press C to stop the test]
152154  (RPS: 2302.6)
---------------Finished!----------------
Finished at 2020/10/28 23:17:04 (took 00:01:06.2215049)
Status 200:    152157

RPS: 2489.5 (requests/second)
Max: 173ms
Min: 0ms
Avg: 0.5ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 1ms
  95%   below 3ms
  98%   below 5ms
  99%   below 7ms
99.9%   below 15ms
```

---


## -Xms512m -Xmx512m

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:17:42
[Press C to stop the test]
155653  (RPS: 2381.5)
---------------Finished!----------------
Finished at 2020/10/28 23:18:47 (took 00:01:05.5354132)
Status 200:    155654

RPS: 2545.1 (requests/second)
Max: 111ms
Min: 0ms
Avg: 0.5ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 1ms
  95%   below 3ms
  98%   below 5ms
  99%   below 7ms
99.9%   below 14ms
```

---

## -Xms1g -Xmx1g

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:19:22
[Press C to stop the test]
176062  (RPS: 2691.7)
---------------Finished!----------------
Finished at 2020/10/28 23:20:27 (took 00:01:05.4652598)
Status 200:    176065

RPS: 2884.3 (requests/second)
Max: 142ms
Min: 0ms
Avg: 3.7ms

  50%   below 3ms
  60%   below 3ms
  70%   below 4ms
  80%   below 5ms
  90%   below 7ms
  95%   below 10ms
  98%   below 14ms
  99%   below 18ms
99.9%   below 38ms
```

---


## -Xms4g -Xmx4g

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:21:04
[Press C to stop the test]
160795  (RPS: 2430.3)
---------------Finished!----------------
Finished at 2020/10/28 23:22:10 (took 00:01:06.2841417)
Status 200:    160795

RPS: 2631.1 (requests/second)
Max: 119ms
Min: 0ms
Avg: 2.5ms

  50%   below 2ms
  60%   below 3ms
  70%   below 3ms
  80%   below 4ms
  90%   below 6ms
  95%   below 8ms
  98%   below 11ms
  99%   below 15ms
99.9%   below 30ms
```

ConcMarkSweepGC吞吐量没有明显差距  
在128m和512m平均响应延迟较好

---

# G1GC
## -Xms128m -Xmx128m

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:22:50
[Press C to stop the test]
178391  (RPS: 2724.6)
---------------Finished!----------------
Finished at 2020/10/28 23:23:55 (took 00:01:05.5783978)
Status 200:    178391

RPS: 2919.6 (requests/second)
Max: 271ms
Min: 0ms
Avg: 3.7ms

  50%   below 3ms
  60%   below 3ms
  70%   below 4ms
  80%   below 5ms
  90%   below 7ms
  95%   below 9ms
  98%   below 13ms
  99%   below 17ms
99.9%   below 35ms
```

---


## -Xms512m -Xmx512m

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:24:30
[Press C to stop the test]
175348  (RPS: 2658.6)
---------------Finished!----------------
Finished at 2020/10/28 23:25:37 (took 00:01:06.1211361)
Status 200:    175348

RPS: 2867.3 (requests/second)
Max: 197ms
Min: 0ms
Avg: 3.5ms

  50%   below 3ms
  60%   below 3ms
  70%   below 4ms
  80%   below 5ms
  90%   below 7ms
  95%   below 9ms
  98%   below 13ms
  99%   below 17ms
99.9%   below 34ms
```

---

## -Xms1g -Xmx1g

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:26:14
[Press C to stop the test]
174354  (RPS: 2620.6)
---------------Finished!----------------
Finished at 2020/10/28 23:27:20 (took 00:01:06.6471897)
Status 200:    174358

RPS: 2853.5 (requests/second)
Max: 102ms
Min: 0ms
Avg: 3.9ms

  50%   below 3ms
  60%   below 3ms
  70%   below 4ms
  80%   below 5ms
  90%   below 7ms
  95%   below 10ms
  98%   below 15ms
  99%   below 19ms
99.9%   below 37ms
```

---


## -Xms4g -Xmx4g

```
>sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2020/10/28 23:39:50
[Press C to stop the test]
165705  (RPS: 2521)
---------------Finished!----------------
Finished at 2020/10/28 23:40:56 (took 00:01:05.9469878)
Status 200:    165717

RPS: 2707.5 (requests/second)
Max: 81ms
Min: 0ms
Avg: 2.7ms

  50%   below 2ms
  60%   below 3ms
  70%   below 3ms
  80%   below 4ms
  90%   below 6ms
  95%   below 8ms
  98%   below 11ms
  99%   below 15ms
99.9%   below 33ms
```

G1GC吞吐量没有明显差距  
在4g时平均响应延迟较好

---

# 总结

128m时，SerialGC表现最好，SerialGC适合小内存服务  
内存越大，追求吞吐量，ParallelGC表现最好  
4g以下内存，追求延迟，ConcMarkSweepGC表现好与G1GC，超过4g，G1GC更佳
