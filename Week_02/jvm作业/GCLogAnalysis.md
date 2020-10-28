# SerialGC
## -Xms128m -Xmx128m

```
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xms128m -Xmx128m -XX:+UseSerialGC GCLogAnalysis
正在执行...
2020-10-28T15:28:46.376+0800: [GC (Allocation Failure) 2020-10-28T15:28:46.376+0800: [DefNew: 34944K->4352K(39296K), 0.0074676 secs] 34944K->11779K(126720K), 0.0075284 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.394+0800: [GC (Allocation Failure) 2020-10-28T15:28:46.394+0800: [DefNew: 39256K->4348K(39296K), 0.0089807 secs] 46683K->27109K(126720K), 0.0090210 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.412+0800: [GC (Allocation Failure) 2020-10-28T15:28:46.412+0800: [DefNew: 38818K->4345K(39296K), 0.0062723 secs] 61578K->38342K(126720K), 0.0063212 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.429+0800: [GC (Allocation Failure) 2020-10-28T15:28:46.429+0800: [DefNew: 39228K->4350K(39296K), 0.0062881 secs] 73225K->49181K(126720K), 0.0063299 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.442+0800: [GC (Allocation Failure) 2020-10-28T15:28:46.442+0800: [DefNew: 39294K->4335K(39296K), 0.0056537 secs] 84125K->61362K(126720K), 0.0056920 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.456+0800: [GC (Allocation Failure) 2020-10-28T15:28:46.456+0800: [DefNew: 39279K->4350K(39296K), 0.0050166 secs] 96306K->71700K(126720K), 0.0050612 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:28:46.468+0800: [GC (Allocation Failure) 2020-10-28T15:28:46.468+0800: [DefNew: 39015K->4351K(39296K), 0.0059565 secs] 106365K->84930K(126720K), 0.0059967 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.481+0800: [GC (Allocation Failure) 2020-10-28T15:28:46.481+0800: [DefNew: 39227K->39227K(39296K), 0.0000162 secs]2020-10-28T15:28:46.481+0800: [Tenured: 80579K->87262K(87424K), 0.0136653 secs] 119806K->95829K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0137371 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.500+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.500+0800: [Tenured: 87262K->87375K(87424K), 0.0166338 secs] 126510K->100846K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0166820 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
2020-10-28T15:28:46.521+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.521+0800: [Tenured: 87375K->87224K(87424K), 0.0162711 secs] 126624K->108466K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0163271 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
2020-10-28T15:28:46.540+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.540+0800: [Tenured: 87224K->87307K(87424K), 0.0207942 secs] 126439K->109255K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0208506 secs] [Times: user=0.03 sys=0.00, real=0.02 secs]
2020-10-28T15:28:46.564+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.564+0800: [Tenured: 87394K->87394K(87424K), 0.0065095 secs] 126628K->117919K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0065561 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.573+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.573+0800: [Tenured: 87394K->87394K(87424K), 0.0022181 secs] 126682K->120302K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0022659 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:28:46.576+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.576+0800: [Tenured: 87394K->87394K(87424K), 0.0073851 secs] 126664K->122383K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0074577 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.585+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.585+0800: [Tenured: 87421K->87396K(87424K), 0.0244871 secs] 126708K->120911K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0245499 secs] [Times: user=0.03 sys=0.00, real=0.02 secs]
2020-10-28T15:28:46.611+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.611+0800: [Tenured: 87396K->87396K(87424K), 0.0085394 secs] 126406K->123771K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0086021 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.621+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.621+0800: [Tenured: 87396K->87396K(87424K), 0.0045523 secs] 126491K->124408K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0046056 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
2020-10-28T15:28:46.626+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.626+0800: [Tenured: 87396K->87396K(87424K), 0.0056778 secs] 126301K->124914K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0057354 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.635+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.635+0800: [Tenured: 87396K->87414K(87424K), 0.0225082 secs] 126677K->125217K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0225876 secs] [Times: user=0.03 sys=0.00, real=0.02 secs]
2020-10-28T15:28:46.658+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.658+0800: [Tenured: 87414K->87414K(87424K), 0.0033329 secs] 126219K->125295K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0033862 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:28:46.661+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.661+0800: [Tenured: 87414K->87414K(87424K), 0.0037439 secs] 126466K->126022K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0037924 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:28:46.665+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.665+0800: [Tenured: 87414K->87414K(87424K), 0.0030440 secs] 126422K->126022K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0030925 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:28:46.669+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.669+0800: [Tenured: 87414K->87414K(87424K), 0.0025442 secs] 126599K->126149K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0025951 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:28:46.672+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.672+0800: [Tenured: 87414K->87414K(87424K), 0.0071680 secs] 126703K->126295K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0072284 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:28:46.679+0800: [Full GC (Allocation Failure) 2020-10-28T15:28:46.679+0800: [Tenured: 87414K->87395K(87424K), 0.0160334 secs] 126295K->126276K(126720K), [Metaspace: 2658K->2658K(1056768K)], 0.0160745 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOf(Arrays.java:3332)
        at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
        at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
        at java.lang.StringBuilder.append(StringBuilder.java:208)
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:56)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)
Heap
 def new generation   total 39296K, used 39054K [0x00000000f8000000, 0x00000000faaa0000, 0x00000000faaa0000)
  eden space 34944K, 100% used [0x00000000f8000000, 0x00000000fa220000, 0x00000000fa220000)
  from space 4352K,  94% used [0x00000000fa660000, 0x00000000faa63aa0, 0x00000000faaa0000)
  to   space 4352K,   0% used [0x00000000fa220000, 0x00000000fa220000, 0x00000000fa660000)
 tenured generation   total 87424K, used 87395K [0x00000000faaa0000, 0x0000000100000000, 0x0000000100000000)
   the space 87424K,  99% used [0x00000000faaa0000, 0x00000000ffff8c30, 0x00000000ffff8e00, 0x0000000100000000)
 Metaspace       used 2689K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 290K, capacity 386K, committed 512K, reserved 1048576K
```
  
几次GC后一直在Full GC，OOM

---

## -Xms512m -Xmx512m

```
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xms512m -Xmx512m -XX:+UseSerialGC GCLogAnalysis
正在执行...
2020-10-28T15:36:54.710+0800: [GC (Allocation Failure) 2020-10-28T15:36:54.710+0800: [DefNew: 139776K->17471K(157248K), 0.0198602 secs] 139776K->47923K(506816K), 0.0199159 secs] [Times: user=0.00 sys=0.02, real=0.02 secs]
2020-10-28T15:36:54.761+0800: [GC (Allocation Failure) 2020-10-28T15:36:54.761+0800: [DefNew: 157247K->17469K(157248K), 0.0241547 secs] 187699K->87244K(506816K), 0.0241978 secs] [Times: user=0.03 sys=0.00, real=0.02 secs]
2020-10-28T15:36:54.817+0800: [GC (Allocation Failure) 2020-10-28T15:36:54.817+0800: [DefNew: 157245K->17471K(157248K), 0.0221687 secs] 227020K->133235K(506816K), 0.0222050 secs] [Times: user=0.00 sys=0.01, real=0.02 secs]
2020-10-28T15:36:54.871+0800: [GC (Allocation Failure) 2020-10-28T15:36:54.871+0800: [DefNew: 157247K->17471K(157248K), 0.0208609 secs] 273011K->176496K(506816K), 0.0209102 secs] [Times: user=0.03 sys=0.00, real=0.02 secs]
2020-10-28T15:36:54.921+0800: [GC (Allocation Failure) 2020-10-28T15:36:54.922+0800: [DefNew: 156903K->17466K(157248K), 0.0207346 secs] 315928K->219112K(506816K), 0.0207914 secs] [Times: user=0.02 sys=0.02, real=0.02 secs]
2020-10-28T15:36:54.967+0800: [GC (Allocation Failure) 2020-10-28T15:36:54.967+0800: [DefNew: 157242K->17471K(157248K), 0.0224983 secs] 358888K->262376K(506816K), 0.0225390 secs] [Times: user=0.03 sys=0.00, real=0.02 secs]
2020-10-28T15:36:55.012+0800: [GC (Allocation Failure) 2020-10-28T15:36:55.012+0800: [DefNew: 156676K->17470K(157248K), 0.0256051 secs] 401581K->310639K(506816K), 0.0256528 secs] [Times: user=0.01 sys=0.02, real=0.03 secs]
2020-10-28T15:36:55.065+0800: [GC (Allocation Failure) 2020-10-28T15:36:55.065+0800: [DefNew: 157246K->17466K(157248K), 0.0213690 secs] 450415K->356257K(506816K), 0.0214203 secs] [Times: user=0.00 sys=0.02, real=0.02 secs]
2020-10-28T15:36:55.112+0800: [GC (Allocation Failure) 2020-10-28T15:36:55.112+0800: [DefNew: 157242K->157242K(157248K), 0.0000276 secs]2020-10-28T15:36:55.112+0800: [Tenured: 338791K->281560K(349568K), 0.0517537 secs] 496033K->281560K(506816K), [Metaspace: 2658K->2658K(1056768K)], 0.0518647 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2020-10-28T15:36:55.188+0800: [GC (Allocation Failure) 2020-10-28T15:36:55.188+0800: [DefNew: 139776K->17470K(157248K), 0.0104378 secs] 421336K->333224K(506816K), 0.0104966 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:36:55.227+0800: [GC (Allocation Failure) 2020-10-28T15:36:55.227+0800: [DefNew: 157233K->157233K(157248K), 0.0000217 secs]2020-10-28T15:36:55.227+0800: [Tenured: 315753K->317200K(349568K), 0.0595648 secs] 472986K->317200K(506816K), [Metaspace: 2658K->2658K(1056768K)], 0.0596457 secs] [Times: user=0.06 sys=0.00, real=0.06 secs]
2020-10-28T15:36:55.311+0800: [GC (Allocation Failure) 2020-10-28T15:36:55.311+0800: [DefNew: 139618K->139618K(157248K), 0.0000233 secs]2020-10-28T15:36:55.311+0800: [Tenured: 317200K->326088K(349568K), 0.0609674 secs] 456819K->326088K(506816K), [Metaspace: 2658K->2658K(1056768K)], 0.0610550 secs] [Times: user=0.06 sys=0.00, real=0.06 secs]
2020-10-28T15:36:55.398+0800: [GC (Allocation Failure) 2020-10-28T15:36:55.399+0800: [DefNew: 139776K->139776K(157248K), 0.0000209 secs]2020-10-28T15:36:55.399+0800: [Tenured: 326088K->320840K(349568K), 0.0637922 secs] 465864K->320840K(506816K), [Metaspace: 2658K->2658K(1056768K)], 0.0638779 secs] [Times: user=0.06 sys=0.00, real=0.06 secs]
2020-10-28T15:36:55.487+0800: [GC (Allocation Failure) 2020-10-28T15:36:55.487+0800: [DefNew: 139776K->139776K(157248K), 0.0000280 secs]2020-10-28T15:36:55.487+0800: [Tenured: 320840K->349293K(349568K), 0.0419808 secs] 460616K->349716K(506816K), [Metaspace: 2658K->2658K(1056768K)], 0.0420791 secs] [Times: user=0.03 sys=0.00, real=0.04 secs]
2020-10-28T15:36:55.559+0800: [Full GC (Allocation Failure) 2020-10-28T15:36:55.559+0800: [Tenured: 349437K->349483K(349568K), 0.0580189 secs] 506615K->352806K(506816K), [Metaspace: 2658K->2658K(1056768K)], 0.0580762 secs] [Times: user=0.06 sys=0.00, real=0.06 secs]
执行结束!共生成对象次数:7982
Heap
 def new generation   total 157248K, used 20223K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,  14% used [0x00000000e0000000, 0x00000000e13bff00, 0x00000000e8880000)
  from space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
  to   space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
 tenured generation   total 349568K, used 349483K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
   the space 349568K,  99% used [0x00000000eaaa0000, 0x00000000fffeae10, 0x00000000fffeb000, 0x0000000100000000)
 Metaspace       used 2665K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K
```

Xmx调大后，只发生了一次Full GC

---

## -Xms1g -Xmx1g

```
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xms1g -Xmx1g -XX:+UseSerialGC GCLogAnalysis
正在执行...
2020-10-28T15:40:48.726+0800: [GC (Allocation Failure) 2020-10-28T15:40:48.726+0800: [DefNew: 279616K->34943K(314560K), 0.0340773 secs] 279616K->85388K(1013632K), 0.0341342 secs] [Times: user=0.03 sys=0.00, real=0.03 secs]
2020-10-28T15:40:48.816+0800: [GC (Allocation Failure) 2020-10-28T15:40:48.816+0800: [DefNew: 314559K->34943K(314560K), 0.0488507 secs] 365004K->174229K(1013632K), 0.0488973 secs] [Times: user=0.02 sys=0.03, real=0.05 secs]
2020-10-28T15:40:48.922+0800: [GC (Allocation Failure) 2020-10-28T15:40:48.922+0800: [DefNew: 314559K->34942K(314560K), 0.0357989 secs] 453845K->248653K(1013632K), 0.0358857 secs] [Times: user=0.02 sys=0.02, real=0.04 secs]
2020-10-28T15:40:49.010+0800: [GC (Allocation Failure) 2020-10-28T15:40:49.010+0800: [DefNew: 314558K->34943K(314560K), 0.0374209 secs] 528269K->325097K(1013632K), 0.0374671 secs] [Times: user=0.02 sys=0.03, real=0.04 secs]
2020-10-28T15:40:49.099+0800: [GC (Allocation Failure) 2020-10-28T15:40:49.099+0800: [DefNew: 314559K->34943K(314560K), 0.0384947 secs] 604713K->401229K(1013632K), 0.0385495 secs] [Times: user=0.02 sys=0.02, real=0.04 secs]
2020-10-28T15:40:49.191+0800: [GC (Allocation Failure) 2020-10-28T15:40:49.191+0800: [DefNew: 314559K->34943K(314560K), 0.0368951 secs] 680845K->471911K(1013632K), 0.0369413 secs] [Times: user=0.03 sys=0.00, real=0.04 secs]
2020-10-28T15:40:49.276+0800: [GC (Allocation Failure) 2020-10-28T15:40:49.276+0800: [DefNew: 314559K->34943K(314560K), 0.0374904 secs] 751527K->547470K(1013632K), 0.0375354 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
2020-10-28T15:40:49.367+0800: [GC (Allocation Failure) 2020-10-28T15:40:49.367+0800: [DefNew: 314559K->34942K(314560K), 0.0417384 secs] 827086K->627116K(1013632K), 0.0417810 secs] [Times: user=0.02 sys=0.03, real=0.04 secs]
2020-10-28T15:40:49.473+0800: [GC (Allocation Failure) 2020-10-28T15:40:49.473+0800: [DefNew: 314558K->34943K(314560K), 0.0420305 secs] 906732K->708369K(1013632K), 0.0420822 secs] [Times: user=0.01 sys=0.03, real=0.04 secs]
2020-10-28T15:40:49.572+0800: [GC (Allocation Failure) 2020-10-28T15:40:49.572+0800: [DefNew: 314559K->314559K(314560K), 0.0000367 secs]2020-10-28T15:40:49.572+0800: [Tenured: 673426K->373432K(699072K), 0.0771591 secs] 987985K->373432K(1013632K), [Metaspace: 2658K->2658K(1056768K)], 0.0772716 secs] [Times: user=0.08 sys=0.00, real=0.08 secs]
执行结束!共生成对象次数:10402
Heap
 def new generation   total 314560K, used 11260K [0x00000000c0000000, 0x00000000d5550000, 0x00000000d5550000)
  eden space 279616K,   4% used [0x00000000c0000000, 0x00000000c0aff1c0, 0x00000000d1110000)
  from space 34944K,   0% used [0x00000000d3330000, 0x00000000d3330000, 0x00000000d5550000)
  to   space 34944K,   0% used [0x00000000d1110000, 0x00000000d1110000, 0x00000000d3330000)
 tenured generation   total 699072K, used 373432K [0x00000000d5550000, 0x0000000100000000, 0x0000000100000000)
   the space 699072K,  53% used [0x00000000d5550000, 0x00000000ec1fe368, 0x00000000ec1fe400, 0x0000000100000000)
 Metaspace       used 2665K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K
```

Xmx再次调大后，GC次数进一步减少，生成对象数增多业务处理能力上升

---

## -Xms4g -Xmx4g

```
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xms4g -Xmx4g -XX:+UseSerialGC GCLogAnalysis
正在执行...
2020-10-28T15:43:52.533+0800: [GC (Allocation Failure) 2020-10-28T15:43:52.533+0800: [DefNew: 1118528K->139776K(1258304K), 0.0947956 secs] 1118528K->257524K(4054528K), 0.0948679 secs] [Times: user=0.06 sys=0.03, real=0.10 secs]
2020-10-28T15:43:52.831+0800: [GC (Allocation Failure) 2020-10-28T15:43:52.831+0800: [DefNew: 1258304K->139775K(1258304K), 0.1195026 secs] 1376052K->422997K(4054528K), 0.1195464 secs] [Times: user=0.08 sys=0.03, real=0.12 secs]
执行结束!共生成对象次数:11085
Heap
 def new generation   total 1258304K, used 838113K [0x00000006c0000000, 0x0000000715550000, 0x0000000715550000)
  eden space 1118528K,  62% used [0x00000006c0000000, 0x00000006ea9f86a8, 0x0000000704450000)
  from space 139776K,  99% used [0x0000000704450000, 0x000000070cccfd60, 0x000000070ccd0000)
  to   space 139776K,   0% used [0x000000070ccd0000, 0x000000070ccd0000, 0x0000000715550000)
 tenured generation   total 2796224K, used 283222K [0x0000000715550000, 0x00000007c0000000, 0x00000007c0000000)
   the space 2796224K,  10% used [0x0000000715550000, 0x00000007269e5880, 0x00000007269e5a00, 0x00000007c0000000)
 Metaspace       used 2665K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K
```

Xmx调到4g后，GC次数只有两次，但是每次GC时间超过100ms，业务处理能力没有太大上升

---

# ParallelGC
## -Xms128m -Xmx128m

```
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xms128m -Xmx128m -XX:+UseParallelGC GCLogAnalysis
正在执行...
2020-10-28T15:46:44.764+0800: [GC (Allocation Failure) [PSYoungGen: 32725K->5094K(38400K)] 32725K->12311K(125952K), 0.0058819 secs] [Times: user=0.00 sys=0.01, real=0.01 secs]
2020-10-28T15:46:44.786+0800: [GC (Allocation Failure) [PSYoungGen: 38278K->5117K(38400K)] 45495K->23172K(125952K), 0.0064705 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:46:44.802+0800: [GC (Allocation Failure) [PSYoungGen: 38397K->5117K(38400K)] 56452K->36190K(125952K), 0.0075197 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:46:44.818+0800: [GC (Allocation Failure) [PSYoungGen: 38260K->5102K(38400K)] 69333K->49152K(125952K), 0.0062478 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:46:44.831+0800: [GC (Allocation Failure) [PSYoungGen: 38363K->5117K(38400K)] 82413K->59280K(125952K), 0.0045977 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:44.844+0800: [GC (Allocation Failure) [PSYoungGen: 38378K->5098K(19968K)] 92542K->71460K(107520K), 0.0052779 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:44.851+0800: [GC (Allocation Failure) [PSYoungGen: 19712K->11174K(29184K)] 86074K->78829K(116736K), 0.0026875 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:44.859+0800: [GC (Allocation Failure) [PSYoungGen: 25988K->14163K(29184K)] 93643K->83270K(116736K), 0.0036369 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:44.866+0800: [GC (Allocation Failure) [PSYoungGen: 28877K->14330K(29184K)] 97985K->88743K(116736K), 0.0044240 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:44.870+0800: [Full GC (Ergonomics) [PSYoungGen: 14330K->0K(29184K)] [ParOldGen: 74412K->80655K(87552K)] 88743K->80655K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0185942 secs] [Times: user=0.00 sys=0.03, real=0.02 secs]
2020-10-28T15:46:44.893+0800: [Full GC (Ergonomics) [PSYoungGen: 14817K->0K(29184K)] [ParOldGen: 80655K->83792K(87552K)] 95473K->83792K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0166488 secs] [Times: user=0.05 sys=0.00, real=0.02 secs]
2020-10-28T15:46:44.912+0800: [Full GC (Ergonomics) [PSYoungGen: 14681K->1153K(29184K)] [ParOldGen: 83792K->87388K(87552K)] 98473K->88542K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0173547 secs] [Times: user=0.05 sys=0.00, real=0.02 secs]
2020-10-28T15:46:44.933+0800: [Full GC (Ergonomics) [PSYoungGen: 14836K->4739K(29184K)] [ParOldGen: 87388K->87532K(87552K)] 102225K->92271K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0148586 secs] [Times: user=0.06 sys=0.00, real=0.01 secs]
2020-10-28T15:46:44.950+0800: [Full GC (Ergonomics) [PSYoungGen: 14696K->7191K(29184K)] [ParOldGen: 87532K->87540K(87552K)] 102228K->94731K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0187134 secs] [Times: user=0.11 sys=0.00, real=0.02 secs]
2020-10-28T15:46:44.970+0800: [Full GC (Ergonomics) [PSYoungGen: 14777K->9393K(29184K)] [ParOldGen: 87540K->87409K(87552K)] 102317K->96803K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0191370 secs] [Times: user=0.05 sys=0.00, real=0.02 secs]
2020-10-28T15:46:44.991+0800: [Full GC (Ergonomics) [PSYoungGen: 14848K->10430K(29184K)] [ParOldGen: 87409K->87309K(87552K)] 102257K->97740K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0172978 secs] [Times: user=0.05 sys=0.00, real=0.02 secs]
2020-10-28T15:46:45.010+0800: [Full GC (Ergonomics) [PSYoungGen: 14840K->11904K(29184K)] [ParOldGen: 87309K->87160K(87552K)] 102149K->99065K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0042910 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:45.015+0800: [Full GC (Ergonomics) [PSYoungGen: 14848K->11976K(29184K)] [ParOldGen: 87160K->87524K(87552K)] 102008K->99501K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0058724 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:46:45.022+0800: [Full GC (Ergonomics) [PSYoungGen: 14842K->12595K(29184K)] [ParOldGen: 87524K->87512K(87552K)] 102366K->100108K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0138741 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
2020-10-28T15:46:45.036+0800: [Full GC (Ergonomics) [PSYoungGen: 14736K->12871K(29184K)] [ParOldGen: 87512K->87498K(87552K)] 102249K->100370K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0125734 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
2020-10-28T15:46:45.049+0800: [Full GC (Ergonomics) [PSYoungGen: 14762K->13463K(29184K)] [ParOldGen: 87498K->87031K(87552K)] 102260K->100495K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0035741 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:45.053+0800: [Full GC (Ergonomics) [PSYoungGen: 14755K->13618K(29184K)] [ParOldGen: 87031K->86965K(87552K)] 101786K->100583K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0097078 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
2020-10-28T15:46:45.063+0800: [Full GC (Ergonomics) [PSYoungGen: 14478K->13883K(29184K)] [ParOldGen: 86965K->86854K(87552K)] 101443K->100738K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0129073 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:46:45.077+0800: [Full GC (Ergonomics) [PSYoungGen: 14477K->13883K(29184K)] [ParOldGen: 86854K->86854K(87552K)] 101332K->100738K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0025655 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
2020-10-28T15:46:45.079+0800: [Full GC (Ergonomics) [PSYoungGen: 14803K->14676K(29184K)] [ParOldGen: 86854K->86854K(87552K)] 101658K->101531K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0023058 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:45.082+0800: [Full GC (Ergonomics) [PSYoungGen: 14768K->14676K(29184K)] [ParOldGen: 86854K->86854K(87552K)] 101622K->101531K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0023393 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:45.084+0800: [Full GC (Ergonomics) [PSYoungGen: 14828K->14676K(29184K)] [ParOldGen: 87377K->87098K(87552K)] 102206K->101775K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0022975 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:45.087+0800: [Full GC (Ergonomics) [PSYoungGen: 14676K->14676K(29184K)] [ParOldGen: 87528K->87098K(87552K)] 102204K->101775K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0025770 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:46:45.090+0800: [Full GC (Ergonomics) [PSYoungGen: 14676K->14676K(29184K)] [ParOldGen: 87390K->87098K(87552K)] 102067K->101775K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0032721 secs] [Times: user=0.02 sys=0.03, real=0.00 secs]
2020-10-28T15:46:45.093+0800: [Full GC (Allocation Failure) [PSYoungGen: 14676K->14676K(29184K)] [ParOldGen: 87098K->87079K(87552K)] 101775K->101756K(116736K), [Metaspace: 2658K->2658K(1056768K)], 0.0168865 secs] [Times: user=0.03 sys=0.00, real=0.02 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:48)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)
Heap
 PSYoungGen      total 29184K, used 14848K [0x00000000fd580000, 0x0000000100000000, 0x0000000100000000)
  eden space 14848K, 100% used [0x00000000fd580000,0x00000000fe400000,0x00000000fe400000)
  from space 14336K, 0% used [0x00000000fe400000,0x00000000fe400000,0x00000000ff200000)
  to   space 14336K, 0% used [0x00000000ff200000,0x00000000ff200000,0x0000000100000000)
 ParOldGen       total 87552K, used 87079K [0x00000000f8000000, 0x00000000fd580000, 0x00000000fd580000)
  object space 87552K, 99% used [0x00000000f8000000,0x00000000fd509df0,0x00000000fd580000)
 Metaspace       used 2689K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 290K, capacity 386K, committed 512K, reserved 1048576K
```

几次GC后一直在Full GC，OOM

---

## -Xms512m -Xmx512m

```
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xms512m -Xmx512m -XX:+UseParallelGC GCLogAnalysis
正在执行...
2020-10-28T15:47:49.163+0800: [GC (Allocation Failure) [PSYoungGen: 131537K->21501K(153088K)] 131537K->42624K(502784K), 0.0139767 secs] [Times: user=0.02 sys=0.05, real=0.01 secs]
2020-10-28T15:47:49.199+0800: [GC (Allocation Failure) [PSYoungGen: 153085K->21494K(153088K)] 174208K->84954K(502784K), 0.0231185 secs] [Times: user=0.02 sys=0.09, real=0.02 secs]
2020-10-28T15:47:49.246+0800: [GC (Allocation Failure) [PSYoungGen: 152809K->21487K(153088K)] 216269K->122546K(502784K), 0.0181931 secs] [Times: user=0.05 sys=0.00, real=0.02 secs]
2020-10-28T15:47:49.288+0800: [GC (Allocation Failure) [PSYoungGen: 153071K->21503K(153088K)] 254130K->163757K(502784K), 0.0191536 secs] [Times: user=0.00 sys=0.05, real=0.02 secs]
2020-10-28T15:47:49.333+0800: [GC (Allocation Failure) [PSYoungGen: 153087K->21497K(153088K)] 295341K->208030K(502784K), 0.0198286 secs] [Times: user=0.02 sys=0.03, real=0.02 secs]
2020-10-28T15:47:49.377+0800: [GC (Allocation Failure) [PSYoungGen: 153081K->21504K(80384K)] 339614K->250791K(430080K), 0.0206189 secs] [Times: user=0.02 sys=0.03, real=0.02 secs]
2020-10-28T15:47:49.409+0800: [GC (Allocation Failure) [PSYoungGen: 80384K->35266K(116736K)] 309671K->270106K(466432K), 0.0090383 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.430+0800: [GC (Allocation Failure) [PSYoungGen: 94146K->47528K(116736K)] 328986K->287530K(466432K), 0.0117235 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.453+0800: [GC (Allocation Failure) [PSYoungGen: 106378K->57614K(116736K)] 346380K->305751K(466432K), 0.0143233 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.479+0800: [GC (Allocation Failure) [PSYoungGen: 116032K->38715K(116736K)] 364168K->322039K(466432K), 0.0178288 secs] [Times: user=0.03 sys=0.03, real=0.02 secs]
2020-10-28T15:47:49.508+0800: [GC (Allocation Failure) [PSYoungGen: 97595K->20169K(116736K)] 380919K->340694K(466432K), 0.0173859 secs] [Times: user=0.03 sys=0.02, real=0.02 secs]
2020-10-28T15:47:49.526+0800: [Full GC (Ergonomics) [PSYoungGen: 20169K->0K(116736K)] [ParOldGen: 320525K->243595K(349696K)] 340694K->243595K(466432K), [Metaspace: 2658K->2658K(1056768K)], 0.0521643 secs] [Times: user=0.11 sys=0.01, real=0.05 secs]
2020-10-28T15:47:49.591+0800: [GC (Allocation Failure) [PSYoungGen: 58880K->16889K(116736K)] 302475K->260485K(466432K), 0.0040869 secs] [Times: user=0.05 sys=0.00, real=0.00 secs]
2020-10-28T15:47:49.608+0800: [GC (Allocation Failure) [PSYoungGen: 75684K->21094K(116736K)] 319279K->280967K(466432K), 0.0071585 secs] [Times: user=0.06 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.626+0800: [GC (Allocation Failure) [PSYoungGen: 79974K->23918K(116736K)] 339847K->304124K(466432K), 0.0085512 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.646+0800: [GC (Allocation Failure) [PSYoungGen: 82742K->25706K(116736K)] 362948K->328352K(466432K), 0.0101942 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.656+0800: [Full GC (Ergonomics) [PSYoungGen: 25706K->0K(116736K)] [ParOldGen: 302645K->277255K(349696K)] 328352K->277255K(466432K), [Metaspace: 2658K->2658K(1056768K)], 0.0549303 secs] [Times: user=0.09 sys=0.00, real=0.06 secs]
2020-10-28T15:47:49.725+0800: [GC (Allocation Failure) [PSYoungGen: 58747K->18229K(116736K)] 336003K->295484K(466432K), 0.0038114 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:47:49.741+0800: [GC (Allocation Failure) [PSYoungGen: 77109K->23113K(116736K)] 354364K->317449K(466432K), 0.0074447 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.759+0800: [GC (Allocation Failure) [PSYoungGen: 81993K->19690K(116736K)] 376329K->336333K(466432K), 0.0085200 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.768+0800: [Full GC (Ergonomics) [PSYoungGen: 19690K->0K(116736K)] [ParOldGen: 316643K->289698K(349696K)] 336333K->289698K(466432K), [Metaspace: 2658K->2658K(1056768K)], 0.0620494 secs] [Times: user=0.17 sys=0.00, real=0.06 secs]
2020-10-28T15:47:49.845+0800: [GC (Allocation Failure) [PSYoungGen: 58880K->17583K(116736K)] 348578K->307282K(466432K), 0.0039965 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-28T15:47:49.860+0800: [GC (Allocation Failure) [PSYoungGen: 76463K->21116K(116736K)] 366162K->327724K(466432K), 0.0071629 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.878+0800: [GC (Allocation Failure) [PSYoungGen: 79996K->19930K(116736K)] 386604K->347282K(466432K), 0.0090443 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.887+0800: [Full GC (Ergonomics) [PSYoungGen: 19930K->0K(116736K)] [ParOldGen: 327351K->299376K(349696K)] 347282K->299376K(466432K), [Metaspace: 2658K->2658K(1056768K)], 0.0585945 secs] [Times: user=0.11 sys=0.00, real=0.06 secs]
2020-10-28T15:47:49.958+0800: [GC (Allocation Failure) [PSYoungGen: 58268K->20746K(116736K)] 357645K->320122K(466432K), 0.0045358 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.975+0800: [GC (Allocation Failure) [PSYoungGen: 79626K->17718K(116736K)] 379002K->335922K(466432K), 0.0075387 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:47:49.983+0800: [Full GC (Ergonomics) [PSYoungGen: 17718K->0K(116736K)] [ParOldGen: 318203K->305129K(349696K)] 335922K->305129K(466432K), [Metaspace: 2658K->2658K(1056768K)], 0.0592853 secs] [Times: user=0.17 sys=0.02, real=0.06 secs]
2020-10-28T15:47:50.053+0800: [GC (Allocation Failure) [PSYoungGen: 58811K->26153K(116736K)] 363941K->331283K(466432K), 0.0060106 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:47:50.069+0800: [GC (Allocation Failure) [PSYoungGen: 84952K->18593K(116736K)] 390082K->348457K(466432K), 0.0094102 secs] [Times: user=0.02 sys=0.03, real=0.01 secs]
2020-10-28T15:47:50.078+0800: [Full GC (Ergonomics) [PSYoungGen: 18593K->0K(116736K)] [ParOldGen: 329863K->313610K(349696K)] 348457K->313610K(466432K), [Metaspace: 2658K->2658K(1056768K)], 0.0611336 secs] [Times: user=0.14 sys=0.00, real=0.06 secs]
执行结束!共生成对象次数:7236
Heap
 PSYoungGen      total 116736K, used 2661K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
  eden space 58880K, 4% used [0x00000000f5580000,0x00000000f5819770,0x00000000f8f00000)
  from space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
  to   space 57856K, 0% used [0x00000000fc780000,0x00000000fc780000,0x0000000100000000)
 ParOldGen       total 349696K, used 313610K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
  object space 349696K, 89% used [0x00000000e0000000,0x00000000f3242b50,0x00000000f5580000)
 Metaspace       used 2665K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K
```

Xmx调大后，没有发生OOM，发生了6次Full GC，相邻Full GC间隔越来越少

---

## -Xms1g -Xmx1g

```
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xms1g -Xmx1g -XX:+UseParallelGC GCLogAnalysis
正在执行...
2020-10-28T15:50:27.630+0800: [GC (Allocation Failure) [PSYoungGen: 262144K->43519K(305664K)] 262144K->74682K(1005056K), 0.0223554 secs] [Times: user=0.00 sys=0.06, real=0.02 secs]
2020-10-28T15:50:27.704+0800: [GC (Allocation Failure) [PSYoungGen: 305663K->43510K(305664K)] 336826K->148974K(1005056K), 0.0376787 secs] [Times: user=0.03 sys=0.09, real=0.04 secs]
2020-10-28T15:50:27.794+0800: [GC (Allocation Failure) [PSYoungGen: 305654K->43517K(305664K)] 411118K->225325K(1005056K), 0.0336964 secs] [Times: user=0.08 sys=0.02, real=0.03 secs]
2020-10-28T15:50:27.880+0800: [GC (Allocation Failure) [PSYoungGen: 305661K->43519K(305664K)] 487469K->300298K(1005056K), 0.0329231 secs] [Times: user=0.02 sys=0.09, real=0.03 secs]
2020-10-28T15:50:27.961+0800: [GC (Allocation Failure) [PSYoungGen: 305663K->43506K(305664K)] 562442K->382728K(1005056K), 0.0367905 secs] [Times: user=0.05 sys=0.05, real=0.04 secs]
2020-10-28T15:50:28.049+0800: [GC (Allocation Failure) [PSYoungGen: 305650K->43518K(160256K)] 644872K->457001K(859648K), 0.0335697 secs] [Times: user=0.03 sys=0.03, real=0.03 secs]
2020-10-28T15:50:28.103+0800: [GC (Allocation Failure) [PSYoungGen: 160254K->66048K(232960K)] 573737K->489459K(932352K), 0.0162103 secs] [Times: user=0.03 sys=0.01, real=0.02 secs]
2020-10-28T15:50:28.142+0800: [GC (Allocation Failure) [PSYoungGen: 182784K->89719K(232960K)] 606195K->524677K(932352K), 0.0223026 secs] [Times: user=0.05 sys=0.00, real=0.02 secs]
2020-10-28T15:50:28.188+0800: [GC (Allocation Failure) [PSYoungGen: 206455K->104856K(232960K)] 641413K->553265K(932352K), 0.0238172 secs] [Times: user=0.06 sys=0.00, real=0.02 secs]
2020-10-28T15:50:28.235+0800: [GC (Allocation Failure) [PSYoungGen: 221549K->72139K(232960K)] 669958K->579229K(932352K), 0.0317001 secs] [Times: user=0.05 sys=0.03, real=0.03 secs]
2020-10-28T15:50:28.289+0800: [GC (Allocation Failure) [PSYoungGen: 188875K->33947K(232960K)] 695965K->606312K(932352K), 0.0286242 secs] [Times: user=0.06 sys=0.00, real=0.03 secs]
2020-10-28T15:50:28.339+0800: [GC (Allocation Failure) [PSYoungGen: 150683K->37123K(232960K)] 723048K->639053K(932352K), 0.0171541 secs] [Times: user=0.03 sys=0.02, real=0.02 secs]
2020-10-28T15:50:28.356+0800: [Full GC (Ergonomics) [PSYoungGen: 37123K->0K(232960K)] [ParOldGen: 601929K->324041K(699392K)] 639053K->324041K(932352K), [Metaspace: 2658K->2658K(1056768K)], 0.0743796 secs] [Times: user=0.22 sys=0.03, real=0.08 secs]
2020-10-28T15:50:28.455+0800: [GC (Allocation Failure) [PSYoungGen: 116736K->41753K(232960K)] 440777K->365794K(932352K), 0.0094228 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-28T15:50:28.485+0800: [GC (Allocation Failure) [PSYoungGen: 158489K->37243K(232960K)] 482530K->397320K(932352K), 0.0138398 secs] [Times: user=0.06 sys=0.00, real=0.01 secs]
执行结束!共生成对象次数:9551
Heap
 PSYoungGen      total 232960K, used 41980K [0x00000000eab00000, 0x0000000100000000, 0x0000000100000000)
  eden space 116736K, 4% used [0x00000000eab00000,0x00000000eafa0590,0x00000000f1d00000)
  from space 116224K, 32% used [0x00000000f8e80000,0x00000000fb2ded08,0x0000000100000000)
  to   space 116224K, 0% used [0x00000000f1d00000,0x00000000f1d00000,0x00000000f8e80000)
 ParOldGen       total 699392K, used 360077K [0x00000000c0000000, 0x00000000eab00000, 0x00000000eab00000)
  object space 699392K, 51% used [0x00000000c0000000,0x00000000d5fa36e8,0x00000000eab00000)
 Metaspace       used 2665K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K
```

Xmx再次调大后，GC次数明显减少，只发生了一次Full GC，时间也在100ms之内

---

## -Xms4g -Xmx4g

```
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xms4g -Xmx4g -XX:+UseParallelGC GCLogAnalysis
正在执行...
2020-10-28T15:52:48.718+0800: [GC (Allocation Failure) [PSYoungGen: 1048576K->174584K(1223168K)] 1048576K->231562K(4019712K), 0.0722629 secs] [Times: user=0.05 sys=0.19, real=0.07 secs]
2020-10-28T15:52:48.995+0800: [GC (Allocation Failure) [PSYoungGen: 1223160K->174590K(1223168K)] 1280138K->354805K(4019712K), 0.0896121 secs] [Times: user=0.08 sys=0.30, real=0.09 secs]
2020-10-28T15:52:49.259+0800: [GC (Allocation Failure) [PSYoungGen: 1223166K->174590K(1223168K)] 1403381K->494848K(4019712K), 0.0713743 secs] [Times: user=0.13 sys=0.19, real=0.07 secs]
执行结束!共生成对象次数:11846
Heap
 PSYoungGen      total 1223168K, used 217138K [0x000000076ab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 1048576K, 4% used [0x000000076ab00000,0x000000076d48d098,0x00000007aab00000)
  from space 174592K, 99% used [0x00000007aab00000,0x00000007b557fb40,0x00000007b5580000)
  to   space 174592K, 0% used [0x00000007b5580000,0x00000007b5580000,0x00000007c0000000)
 ParOldGen       total 2796544K, used 320257K [0x00000006c0000000, 0x000000076ab00000, 0x000000076ab00000)
  object space 2796544K, 11% used [0x00000006c0000000,0x00000006d38c07d0,0x000000076ab00000)
 Metaspace       used 2665K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K
```

Xmx调到4g后，只有3次GC，时间在100ms之内，业务能力明显上升

---

# ConcMarkSweepGC
## -Xms128m -Xmx128m

```
$ java -XX:+PrintGC -XX:+PrintGCDateStamps -Xms128m -Xmx128m -XX:+UseConcMarkSweepGC GCLogAnalysis
正在执行...
2020-10-28T15:55:26.971+0800: [GC (Allocation Failure)  34944K->13273K(126720K), 0.0051125 secs]
2020-10-28T15:55:26.989+0800: [GC (Allocation Failure)  48217K->23629K(126720K), 0.0068865 secs]
2020-10-28T15:55:27.010+0800: [GC (Allocation Failure)  58478K->35261K(126720K), 0.0061732 secs]
2020-10-28T15:55:27.023+0800: [GC (Allocation Failure)  70062K->46537K(126720K), 0.0060619 secs]
2020-10-28T15:55:27.036+0800: [GC (Allocation Failure)  81380K->60421K(126720K), 0.0070969 secs]
2020-10-28T15:55:27.043+0800: [GC (CMS Initial Mark)  60549K(126720K), 0.0001441 secs]
2020-10-28T15:55:27.052+0800: [GC (Allocation Failure)  95252K->70592K(126720K), 0.0052822 secs]
2020-10-28T15:55:27.066+0800: [GC (Allocation Failure)  105415K->82257K(126720K), 0.0057709 secs]
2020-10-28T15:55:27.080+0800: [Full GC (Allocation Failure)  116909K->84929K(126720K), 0.0193399 secs]
2020-10-28T15:55:27.107+0800: [Full GC (Allocation Failure)  119873K->97088K(126720K), 0.0217653 secs]
2020-10-28T15:55:27.129+0800: [GC (CMS Initial Mark)  97376K(126720K), 0.0001390 secs]
2020-10-28T15:55:27.132+0800: [GC (CMS Final Remark)  109455K(126720K), 0.0011985 secs]
2020-10-28T15:55:27.136+0800: [Full GC (Allocation Failure)  125925K->106642K(126720K), 0.0183716 secs]
2020-10-28T15:55:27.155+0800: [GC (CMS Initial Mark)  107289K(126720K), 0.0001224 secs]
2020-10-28T15:55:27.157+0800: [GC (CMS Final Remark)  115426K(126720K), 0.0011128 secs]
2020-10-28T15:55:27.161+0800: [Full GC (Allocation Failure)  126223K->112329K(126720K), 0.0210449 secs]
2020-10-28T15:55:27.182+0800: [GC (CMS Initial Mark)  112522K(126720K), 0.0001216 secs]
2020-10-28T15:55:27.185+0800: [GC (CMS Final Remark)  125106K(126720K), 0.0010149 secs]
2020-10-28T15:55:27.187+0800: [Full GC (Allocation Failure)  126399K->117814K(126720K), 0.0212718 secs]
2020-10-28T15:55:27.208+0800: [GC (CMS Initial Mark)  118071K(126720K), 0.0002961 secs]
2020-10-28T15:55:27.211+0800: [Full GC (Allocation Failure)  126418K->118885K(126720K), 0.0201886 secs]
2020-10-28T15:55:27.233+0800: [Full GC (Allocation Failure)  126565K->120890K(126720K), 0.0234517 secs]
2020-10-28T15:55:27.258+0800: [GC (CMS Initial Mark)  121480K(126720K), 0.0001370 secs]
2020-10-28T15:55:27.261+0800: [Full GC (Allocation Failure)  126477K->121735K(126720K), 0.0022987 secs]
2020-10-28T15:55:27.265+0800: [Full GC (Allocation Failure)  126681K->122848K(126720K), 0.0024124 secs]
2020-10-28T15:55:27.268+0800: [GC (CMS Initial Mark)  122968K(126720K), 0.0001090 secs]
2020-10-28T15:55:27.269+0800: [Full GC (Allocation Failure)  126313K->123949K(126720K), 0.0159991 secs]
2020-10-28T15:55:27.286+0800: [Full GC (Allocation Failure)  126340K->124132K(126720K), 0.0028663 secs]
2020-10-28T15:55:27.289+0800: [GC (CMS Initial Mark)  124420K(126720K), 0.0000987 secs]
2020-10-28T15:55:27.290+0800: [Full GC (Allocation Failure)  126482K->124213K(126720K), 0.0018538 secs]
2020-10-28T15:55:27.293+0800: [Full GC (Allocation Failure)  126642K->125389K(126720K), 0.0162091 secs]
2020-10-28T15:55:27.310+0800: [GC (CMS Initial Mark)  125533K(126720K), 0.0005432 secs]
2020-10-28T15:55:27.313+0800: [Full GC (Allocation Failure)  126583K->125495K(126720K), 0.0034415 secs]
2020-10-28T15:55:27.317+0800: [Full GC (Allocation Failure)  126113K->125423K(126720K), 0.0086989 secs]
2020-10-28T15:55:27.326+0800: [GC (CMS Initial Mark)  125839K(126720K), 0.0001236 secs]
2020-10-28T15:55:27.328+0800: [Full GC (Allocation Failure)  126595K->125898K(126720K), 0.0027499 secs]
2020-10-28T15:55:27.331+0800: [Full GC (Allocation Failure)  126692K->125934K(126720K), 0.0017973 secs]
2020-10-28T15:55:27.333+0800: [GC (CMS Initial Mark)  126006K(126720K), 0.0000880 secs]
2020-10-28T15:55:27.334+0800: [Full GC (Allocation Failure)  126702K->125614K(126720K), 0.0174048 secs]
2020-10-28T15:55:27.352+0800: [Full GC (Allocation Failure)  126402K->125596K(126720K), 0.0019805 secs]
2020-10-28T15:55:27.355+0800: [GC (CMS Initial Mark)  125804K(126720K), 0.0000979 secs]
2020-10-28T15:55:27.356+0800: [Full GC (Allocation Failure)  126239K->125596K(126720K), 0.0018613 secs]
2020-10-28T15:55:27.358+0800: [Full GC (Allocation Failure)  126418K->125740K(126720K), 0.0027751 secs]
2020-10-28T15:55:27.361+0800: [GC (CMS Initial Mark)  126028K(126720K), 0.0001366 secs]
2020-10-28T15:55:27.363+0800: [Full GC (Allocation Failure)  126412K->125467K(126720K), 0.0066485 secs]
2020-10-28T15:55:27.370+0800: [Full GC (Allocation Failure)  126330K->125784K(126720K), 0.0053280 secs]
2020-10-28T15:55:27.376+0800: [GC (CMS Initial Mark)  125933K(126720K), 0.0001318 secs]
2020-10-28T15:55:27.378+0800: [Full GC (Allocation Failure)  126130K->125542K(126720K), 0.0020215 secs]
2020-10-28T15:55:27.380+0800: [Full GC (Allocation Failure)  125903K->125542K(126720K), 0.0018451 secs]
2020-10-28T15:55:27.382+0800: [GC (CMS Initial Mark)  126215K(126720K), 0.0001022 secs]
2020-10-28T15:55:27.383+0800: [Full GC (Allocation Failure)  126215K->126215K(126720K), 0.0018155 secs]
2020-10-28T15:55:27.385+0800: [Full GC (Allocation Failure)  126215K->126196K(126720K), 0.0224885 secs]
2020-10-28T15:55:27.408+0800: [Full GC (Allocation Failure)  126683K->126660K(126720K), 0.0032749 secs]
2020-10-28T15:55:27.412+0800: [GC (CMS Initial Mark)  126696K(126720K), 0.0001034 secs]
2020-10-28T15:55:27.413+0800: [Full GC (Allocation Failure)  126708K->126678K(126720K), 0.0027984 secs]
2020-10-28T15:55:27.416+0800: [Full GC (Allocation Failure)  126678K->126678K(126720K), 0.0019785 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOf(Arrays.java:3332)
        at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
        at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
        at java.lang.StringBuilder.append(StringBuilder.java:208)
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:56)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)
```

几次GC后一直在Full GC，OOM

---

## -Xms512m -Xmx512m

```
$ java -XX:+PrintGC -XX:+PrintGCDateStamps -Xms512m -Xmx512m -XX:+UseConcMarkSweepGC GCLogAnalysis
正在执行...
2020-10-28T15:57:23.346+0800: [GC (Allocation Failure)  139776K->44620K(506816K), 0.0140229 secs]
2020-10-28T15:57:23.385+0800: [GC (Allocation Failure)  184396K->87556K(506816K), 0.0190600 secs]
2020-10-28T15:57:23.430+0800: [GC (Allocation Failure)  227332K->130762K(506816K), 0.0206162 secs]
2020-10-28T15:57:23.477+0800: [GC (Allocation Failure)  270538K->169880K(506816K), 0.0192085 secs]
2020-10-28T15:57:23.524+0800: [GC (Allocation Failure)  309425K->211760K(506816K), 0.0209174 secs]
2020-10-28T15:57:23.545+0800: [GC (CMS Initial Mark)  212226K(506816K), 0.0001496 secs]
2020-10-28T15:57:23.570+0800: [GC (Allocation Failure)  351536K->254235K(506816K), 0.0243730 secs]
2020-10-28T15:57:23.618+0800: [GC (Allocation Failure)  394011K->299245K(506816K), 0.0241926 secs]
2020-10-28T15:57:23.667+0800: [GC (Allocation Failure)  439021K->341916K(506816K), 0.0203584 secs]
2020-10-28T15:57:23.712+0800: [Full GC (Allocation Failure)  481692K->258381K(506816K), 0.0500512 secs]
2020-10-28T15:57:23.787+0800: [GC (Allocation Failure)  398157K->307290K(506816K), 0.0120184 secs]
2020-10-28T15:57:23.799+0800: [GC (CMS Initial Mark)  307803K(506816K), 0.0000967 secs]
2020-10-28T15:57:23.823+0800: [GC (Allocation Failure)  447066K->349413K(506816K), 0.0138891 secs]
2020-10-28T15:57:23.837+0800: [GC (CMS Final Remark)  349902K(506816K), 0.0012806 secs]
2020-10-28T15:57:23.862+0800: [Full GC (Allocation Failure)  460979K->305899K(506816K), 0.0553519 secs]
2020-10-28T15:57:23.918+0800: [GC (CMS Initial Mark)  306568K(506816K), 0.0001086 secs]
2020-10-28T15:57:23.942+0800: [GC (Allocation Failure)  444980K->353431K(506816K), 0.0104666 secs]
2020-10-28T15:57:23.952+0800: [GC (CMS Final Remark)  354191K(506816K), 0.0012478 secs]
2020-10-28T15:57:23.979+0800: [Full GC (Allocation Failure)  492350K->314419K(506816K), 0.0578318 secs]
2020-10-28T15:57:24.037+0800: [GC (CMS Initial Mark)  314697K(506816K), 0.0001212 secs]
2020-10-28T15:57:24.061+0800: [GC (Allocation Failure)  454195K->361909K(506816K), 0.0115936 secs]
2020-10-28T15:57:24.072+0800: [GC (CMS Final Remark)  362340K(506816K), 0.0010682 secs]
2020-10-28T15:57:24.097+0800: [Full GC (Allocation Failure)  501647K->317771K(506816K), 0.0587626 secs]
2020-10-28T15:57:24.157+0800: [GC (CMS Initial Mark)  318059K(506816K), 0.0000995 secs]
2020-10-28T15:57:24.182+0800: [Full GC (Allocation Failure)  457547K->325232K(506816K), 0.0595289 secs]
2020-10-28T15:57:24.265+0800: [Full GC (Allocation Failure)  464889K->331853K(506816K), 0.0599153 secs]
2020-10-28T15:57:24.326+0800: [GC (CMS Initial Mark)  331996K(506816K), 0.0001015 secs]
执行结束!共生成对象次数:9403
```

Xmx调大后没有发生OOM，经过几次GC后Full GC频率越来越高

---

## -Xms1g -Xmx1g

```
$ java -XX:+PrintGC -XX:+PrintGCDateStamps -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC GCLogAnalysis
正在执行...
2020-10-28T15:59:01.261+0800: [GC (Allocation Failure)  272640K->87292K(1014528K), 0.0318545 secs]
2020-10-28T15:59:01.347+0800: [GC (Allocation Failure)  359932K->159846K(1014528K), 0.0367885 secs]
2020-10-28T15:59:01.441+0800: [GC (Allocation Failure)  432486K->238128K(1014528K), 0.0416271 secs]
2020-10-28T15:59:01.530+0800: [GC (Allocation Failure)  510768K->315254K(1014528K), 0.0416882 secs]
2020-10-28T15:59:01.625+0800: [GC (Allocation Failure)  587763K->396416K(1014528K), 0.0419788 secs]
2020-10-28T15:59:01.667+0800: [GC (CMS Initial Mark)  396704K(1014528K), 0.0001157 secs]
2020-10-28T15:59:01.719+0800: [GC (Allocation Failure)  669056K->469158K(1014528K), 0.0398736 secs]
2020-10-28T15:59:01.816+0800: [GC (Allocation Failure)  741446K->554547K(1014528K), 0.0465228 secs]
2020-10-28T15:59:01.913+0800: [GC (Allocation Failure)  827187K->638778K(1014528K), 0.0413065 secs]
2020-10-28T15:59:02.004+0800: [GC (Allocation Failure)  911418K->721715K(1014528K), 0.0478911 secs]
2020-10-28T15:59:02.052+0800: [GC (CMS Final Remark)  722058K(1014528K), 0.0016323 secs]
执行结束!共生成对象次数:10386
```

Xmx调大到1g后，没有发生Full GC

---

## -Xms4g -Xmx4g

```
$ java -XX:+PrintGC -XX:+PrintGCDateStamps -Xms4g -Xmx4g -XX:+UseConcMarkSweepGC GCLogAnalysis
正在执行...
2020-10-28T16:00:58.560+0800: [GC (Allocation Failure)  272640K->84868K(4160256K), 0.0348309 secs]
2020-10-28T16:00:58.647+0800: [GC (Allocation Failure)  357508K->156877K(4160256K), 0.0456974 secs]
2020-10-28T16:00:58.746+0800: [GC (Allocation Failure)  429517K->230272K(4160256K), 0.0517518 secs]
2020-10-28T16:00:58.853+0800: [GC (Allocation Failure)  502912K->305579K(4160256K), 0.0516732 secs]
2020-10-28T16:00:58.959+0800: [GC (Allocation Failure)  578219K->396309K(4160256K), 0.0541270 secs]
2020-10-28T16:00:59.062+0800: [GC (Allocation Failure)  668949K->473650K(4160256K), 0.0505916 secs]
2020-10-28T16:00:59.163+0800: [GC (Allocation Failure)  746290K->547106K(4160256K), 0.0476593 secs]
2020-10-28T16:00:59.263+0800: [GC (Allocation Failure)  819484K->628201K(4160256K), 0.0489727 secs]
2020-10-28T16:00:59.357+0800: [GC (Allocation Failure)  900841K->718013K(4160256K), 0.0603598 secs]
执行结束!共生成对象次数:9357
```

Xmx调大到4g后，没有发生Full GC，生成对象数较1g有所下降

---

# G1GC
## -Xms128m -Xmx128m

```
$ java -XX:+PrintGC -XX:+PrintGCDateStamps -Xms128m -Xmx128m -XX:+UseG1GC GCLogAnalysis
正在执行...
2020-10-28T16:44:53.471+0800: [GC pause (G1 Evacuation Pause) (young) 15M->4188K(128M), 0.0030613 secs]
2020-10-28T16:44:53.484+0800: [GC pause (G1 Evacuation Pause) (young) 20M->11M(128M), 0.0036168 secs]
2020-10-28T16:44:53.503+0800: [GC pause (G1 Evacuation Pause) (young) 42M->21M(128M), 0.0042101 secs]
2020-10-28T16:44:53.535+0800: [GC pause (G1 Evacuation Pause) (young) 82M->43M(128M), 0.0063208 secs]
2020-10-28T16:44:53.555+0800: [GC pause (G1 Evacuation Pause) (young) 92M->59M(128M), 0.0051101 secs]
2020-10-28T16:44:53.561+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 62M->59M(128M), 0.0037004 secs]
2020-10-28T16:44:53.565+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.565+0800: [GC concurrent-root-region-scan-end, 0.0000987 secs]
2020-10-28T16:44:53.565+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.566+0800: [GC concurrent-mark-end, 0.0012182 secs]
2020-10-28T16:44:53.566+0800: [GC remark, 0.0010216 secs]
2020-10-28T16:44:53.567+0800: [GC cleanup 64M->64M(128M), 0.0001950 secs]
2020-10-28T16:44:53.577+0800: [GC pause (G1 Evacuation Pause) (young) 103M->75M(128M), 0.0041765 secs]
2020-10-28T16:44:53.584+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 82M->77M(128M), 0.0017050 secs]
2020-10-28T16:44:53.585+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.586+0800: [GC concurrent-root-region-scan-end, 0.0001090 secs]
2020-10-28T16:44:53.586+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.587+0800: [GC concurrent-mark-end, 0.0013963 secs]
2020-10-28T16:44:53.587+0800: [GC remark, 0.0009229 secs]
2020-10-28T16:44:53.588+0800: [GC cleanup 86M->86M(128M), 0.0001318 secs]
2020-10-28T16:44:53.592+0800: [GC pause (G1 Evacuation Pause) (young) 102M->87M(128M), 0.0021822 secs]
2020-10-28T16:44:53.597+0800: [GC pause (G1 Evacuation Pause) (mixed) 93M->86M(128M), 0.0023247 secs]
2020-10-28T16:44:53.600+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 88M->87M(128M), 0.0007639 secs]
2020-10-28T16:44:53.601+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.601+0800: [GC concurrent-root-region-scan-end, 0.0001192 secs]
2020-10-28T16:44:53.601+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.603+0800: [GC concurrent-mark-end, 0.0019019 secs]
2020-10-28T16:44:53.603+0800: [GC remark, 0.0009948 secs]
2020-10-28T16:44:53.604+0800: [GC cleanup 98M->98M(128M), 0.0001540 secs]
2020-10-28T16:44:53.605+0800: [GC pause (G1 Evacuation Pause) (young) 101M->92M(128M), 0.0014038 secs]
2020-10-28T16:44:53.607+0800: [GC pause (G1 Evacuation Pause) (mixed) 96M->91M(128M), 0.0015506 secs]
2020-10-28T16:44:53.611+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 98M->92M(128M), 0.0011318 secs]
2020-10-28T16:44:53.612+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.612+0800: [GC concurrent-root-region-scan-end, 0.0001390 secs]
2020-10-28T16:44:53.612+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.614+0800: [GC concurrent-mark-end, 0.0023512 secs]
2020-10-28T16:44:53.615+0800: [GC remark, 0.0009502 secs]
2020-10-28T16:44:53.616+0800: [GC cleanup 102M->102M(128M), 0.0001658 secs]
2020-10-28T16:44:53.616+0800: [GC pause (G1 Evacuation Pause) (young) 105M->98M(128M), 0.0015317 secs]
2020-10-28T16:44:53.619+0800: [GC pause (G1 Evacuation Pause) (mixed) 104M->99M(128M), 0.0014914 secs]
2020-10-28T16:44:53.621+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 100M->99M(128M), 0.0005992 secs]
2020-10-28T16:44:53.621+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.622+0800: [GC concurrent-root-region-scan-end, 0.0001157 secs]
2020-10-28T16:44:53.622+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.623+0800: [GC pause (G1 Evacuation Pause) (young) 105M->102M(128M), 0.0009135 secs]
2020-10-28T16:44:53.624+0800: [GC concurrent-mark-end, 0.0022726 secs]
2020-10-28T16:44:53.624+0800: [GC remark, 0.0011941 secs]
2020-10-28T16:44:53.625+0800: [GC cleanup 103M->103M(128M), 0.0001421 secs]
2020-10-28T16:44:53.627+0800: [GC pause (G1 Evacuation Pause) (young)-- 109M->109M(128M), 0.0016043 secs]
2020-10-28T16:44:53.630+0800: [GC pause (G1 Evacuation Pause) (mixed)-- 111M->111M(128M), 0.0007240 secs]
2020-10-28T16:44:53.631+0800: [Full GC (Allocation Failure)  111M->95M(128M), 0.0178485 secs]
2020-10-28T16:44:53.649+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 95M->95M(128M), 0.0004398 secs]
2020-10-28T16:44:53.649+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.649+0800: [GC concurrent-root-region-scan-end, 0.0000264 secs]
2020-10-28T16:44:53.649+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.651+0800: [GC pause (G1 Humongous Allocation) (young)-- 100M->99M(128M), 0.0008748 secs]
2020-10-28T16:44:53.652+0800: [GC pause (G1 Humongous Allocation) (young)-- 100M->99M(128M), 0.0005527 secs]
2020-10-28T16:44:53.652+0800: [GC pause (G1 Humongous Allocation) (young) 100M->100M(128M), 0.0004634 secs]
2020-10-28T16:44:53.653+0800: [Full GC (Allocation Failure)  100M->96M(128M), 0.0144070 secs]
2020-10-28T16:44:53.667+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.668+0800: [GC pause (G1 Evacuation Pause) (young)-- 102M->101M(128M), 0.0006845 secs]
2020-10-28T16:44:53.669+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark)-- 102M->102M(128M), 0.0004753 secs]
2020-10-28T16:44:53.670+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.670+0800: [GC concurrent-root-region-scan-end, 0.0000142 secs]
2020-10-28T16:44:53.670+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.670+0800: [Full GC (Allocation Failure)  102M->99M(128M), 0.0051010 secs]
2020-10-28T16:44:53.675+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.676+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 100M->99M(128M), 0.0004812 secs]
2020-10-28T16:44:53.676+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.676+0800: [GC concurrent-root-region-scan-end, 0.0000197 secs]
2020-10-28T16:44:53.676+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.677+0800: [GC pause (G1 Humongous Allocation) (young)-- 101M->100M(128M), 0.0005677 secs]
2020-10-28T16:44:53.678+0800: [GC pause (G1 Evacuation Pause) (young) 101M->101M(128M), 0.0010808 secs]
2020-10-28T16:44:53.679+0800: [GC pause (G1 Evacuation Pause) (young) 101M->101M(128M), 0.0004694 secs]
2020-10-28T16:44:53.680+0800: [Full GC (Allocation Failure)  101M->99M(128M), 0.0030384 secs]
2020-10-28T16:44:53.683+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.683+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 101M->99M(128M), 0.0005582 secs]
2020-10-28T16:44:53.684+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.684+0800: [GC concurrent-root-region-scan-end, 0.0000876 secs]
2020-10-28T16:44:53.684+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.685+0800: [GC pause (G1 Evacuation Pause) (young)-- 101M->101M(128M), 0.0005629 secs]
2020-10-28T16:44:53.685+0800: [Full GC (Allocation Failure)  101M->100M(128M), 0.0042251 secs]
2020-10-28T16:44:53.690+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.690+0800: [GC pause (G1 Evacuation Pause) (young)-- 101M->101M(128M), 0.0004315 secs]
2020-10-28T16:44:53.691+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark)-- 102M->102M(128M), 0.0004066 secs]
2020-10-28T16:44:53.691+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.691+0800: [GC concurrent-root-region-scan-end, 0.0000130 secs]
2020-10-28T16:44:53.691+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.691+0800: [Full GC (Allocation Failure)  102M->100M(128M), 0.0127996 secs]
2020-10-28T16:44:53.704+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.704+0800: [GC pause (G1 Evacuation Pause) (young)-- 102M->102M(128M), 0.0006506 secs]
2020-10-28T16:44:53.705+0800: [Full GC (Allocation Failure)  102M->100M(128M), 0.0032828 secs]
2020-10-28T16:44:53.709+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 101M->101M(128M), 0.0004844 secs]
2020-10-28T16:44:53.709+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.709+0800: [GC concurrent-root-region-scan-end, 0.0000134 secs]
2020-10-28T16:44:53.709+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.709+0800: [GC pause (G1 Humongous Allocation) (young) 101M->101M(128M), 0.0003924 secs]
2020-10-28T16:44:53.710+0800: [Full GC (Allocation Failure)  101M->100M(128M), 0.0036807 secs]
2020-10-28T16:44:53.714+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.714+0800: [GC pause (G1 Evacuation Pause) (young) 101M->100M(128M), 0.0006150 secs]
2020-10-28T16:44:53.715+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark)-- 101M->101M(128M), 0.0004879 secs]
2020-10-28T16:44:53.715+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.715+0800: [GC concurrent-root-region-scan-end, 0.0000134 secs]
2020-10-28T16:44:53.715+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.715+0800: [Full GC (Allocation Failure)  101M->100M(128M), 0.0029773 secs]
2020-10-28T16:44:53.718+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.719+0800: [GC pause (G1 Evacuation Pause) (young)-- 101M->101M(128M), 0.0004804 secs]
2020-10-28T16:44:53.719+0800: [Full GC (Allocation Failure)  101M->101M(128M), 0.0027100 secs]
2020-10-28T16:44:53.722+0800: [GC pause (G1 Evacuation Pause) (young)-- 102M->102M(128M), 0.0004611 secs]
2020-10-28T16:44:53.723+0800: [Full GC (Allocation Failure)  102M->101M(128M), 0.0026488 secs]
2020-10-28T16:44:53.726+0800: [GC pause (G1 Evacuation Pause) (young)-- 102M->102M(128M), 0.0004927 secs]
2020-10-28T16:44:53.726+0800: [Full GC (Allocation Failure)  102M->101M(128M), 0.0037123 secs]
2020-10-28T16:44:53.731+0800: [GC pause (G1 Evacuation Pause) (young)-- 102M->102M(128M), 0.0005973 secs]
2020-10-28T16:44:53.731+0800: [Full GC (Allocation Failure)  102M->101M(128M), 0.0027913 secs]
2020-10-28T16:44:53.734+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 101M->101M(128M), 0.0004311 secs]
2020-10-28T16:44:53.735+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.735+0800: [GC concurrent-root-region-scan-end, 0.0000142 secs]
2020-10-28T16:44:53.735+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.735+0800: [GC pause (G1 Humongous Allocation) (young) 101M->101M(128M), 0.0003367 secs]
2020-10-28T16:44:53.735+0800: [Full GC (Allocation Failure)  101M->101M(128M), 0.0028486 secs]
2020-10-28T16:44:53.738+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.738+0800: [GC pause (G1 Evacuation Pause) (young) 101M->101M(128M), 0.0005704 secs]
2020-10-28T16:44:53.739+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 101M->101M(128M), 0.0004105 secs]
2020-10-28T16:44:53.739+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.739+0800: [GC concurrent-root-region-scan-end, 0.0000130 secs]
2020-10-28T16:44:53.739+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.739+0800: [Full GC (Allocation Failure)  101M->101M(128M), 0.0026153 secs]
2020-10-28T16:44:53.742+0800: [Full GC (Allocation Failure)  101M->101M(128M), 0.0041967 secs]
2020-10-28T16:44:53.746+0800: [GC concurrent-mark-abort]
2020-10-28T16:44:53.746+0800: [GC pause (G1 Evacuation Pause) (young) 101M->101M(128M), 0.0006194 secs]
2020-10-28T16:44:53.747+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 101M->101M(128M), 0.0004729 secs]
2020-10-28T16:44:53.748+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:44:53.748+0800: [GC concurrent-root-region-scan-end, 0.0000150 secs]
2020-10-28T16:44:53.748+0800: [GC concurrent-mark-start]
2020-10-28T16:44:53.748+0800: [Full GC (Allocation Failure)  101M->507K(128M), 0.0030688 secs]
2020-10-28T16:44:53.751+0800: [GC concurrent-mark-abort]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:45)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)
```

几次GC后一直在Full GC，OOM

---

## -Xms512m -Xmx512m

```
$ java -XX:+PrintGC -XX:+PrintGCDateStamps -Xms512m -Xmx512m -XX:+UseG1GC GCLogAnalysis
正在执行...
2020-10-28T16:46:21.279+0800: [GC pause (G1 Evacuation Pause) (young) 30M->11M(512M), 0.0036716 secs]
2020-10-28T16:46:21.289+0800: [GC pause (G1 Evacuation Pause) (young) 35M->21M(512M), 0.0034585 secs]
2020-10-28T16:46:21.309+0800: [GC pause (G1 Evacuation Pause) (young) 56M->32M(512M), 0.0035216 secs]
2020-10-28T16:46:21.325+0800: [GC pause (G1 Evacuation Pause) (young) 74M->44M(512M), 0.0039874 secs]
2020-10-28T16:46:21.346+0800: [GC pause (G1 Evacuation Pause) (young) 95M->61M(512M), 0.0078857 secs]
2020-10-28T16:46:21.378+0800: [GC pause (G1 Evacuation Pause) (young) 137M->89M(512M), 0.0085484 secs]
2020-10-28T16:46:21.405+0800: [GC pause (G1 Evacuation Pause) (young) 169M->112M(512M), 0.0071471 secs]
2020-10-28T16:46:21.453+0800: [GC pause (G1 Evacuation Pause) (young) 240M->154M(512M), 0.0115589 secs]
2020-10-28T16:46:21.512+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 316M->207M(512M), 0.0155680 secs]
2020-10-28T16:46:21.527+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:21.528+0800: [GC concurrent-root-region-scan-end, 0.0001966 secs]
2020-10-28T16:46:21.528+0800: [GC concurrent-mark-start]
2020-10-28T16:46:21.530+0800: [GC concurrent-mark-end, 0.0026074 secs]
2020-10-28T16:46:21.530+0800: [GC remark, 0.0020184 secs]
2020-10-28T16:46:21.533+0800: [GC cleanup 220M->218M(512M), 0.0003667 secs]
2020-10-28T16:46:21.533+0800: [GC concurrent-cleanup-start]
2020-10-28T16:46:21.533+0800: [GC concurrent-cleanup-end, 0.0000217 secs]
2020-10-28T16:46:21.600+0800: [GC pause (G1 Evacuation Pause) (young)-- 420M->344M(512M), 0.0104678 secs]
2020-10-28T16:46:21.612+0800: [GC pause (G1 Evacuation Pause) (mixed) 353M->343M(512M), 0.0061077 secs]
2020-10-28T16:46:21.620+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 353M->345M(512M), 0.0014428 secs]
2020-10-28T16:46:21.622+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:21.622+0800: [GC concurrent-root-region-scan-end, 0.0001220 secs]
2020-10-28T16:46:21.622+0800: [GC concurrent-mark-start]
2020-10-28T16:46:21.625+0800: [GC concurrent-mark-end, 0.0030128 secs]
2020-10-28T16:46:21.625+0800: [GC remark, 0.0020875 secs]
2020-10-28T16:46:21.628+0800: [GC cleanup 355M->355M(512M), 0.0004058 secs]
2020-10-28T16:46:21.644+0800: [GC pause (G1 Evacuation Pause) (young) 413M->361M(512M), 0.0048405 secs]
2020-10-28T16:46:21.656+0800: [GC pause (G1 Evacuation Pause) (mixed) 385M->320M(512M), 0.0046723 secs]
2020-10-28T16:46:21.666+0800: [GC pause (G1 Evacuation Pause) (mixed) 349M->286M(512M), 0.0059340 secs]
2020-10-28T16:46:21.678+0800: [GC pause (G1 Evacuation Pause) (mixed) 311M->273M(512M), 0.0059458 secs]
2020-10-28T16:46:21.686+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 280M->275M(512M), 0.0020069 secs]
2020-10-28T16:46:21.688+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:21.688+0800: [GC concurrent-root-region-scan-end, 0.0001370 secs]
2020-10-28T16:46:21.688+0800: [GC concurrent-mark-start]
2020-10-28T16:46:21.692+0800: [GC concurrent-mark-end, 0.0033167 secs]
2020-10-28T16:46:21.692+0800: [GC remark, 0.0020764 secs]
2020-10-28T16:46:21.694+0800: [GC cleanup 292M->292M(512M), 0.0003640 secs]
2020-10-28T16:46:21.724+0800: [GC pause (G1 Evacuation Pause) (young)-- 415M->320M(512M), 0.0076527 secs]
2020-10-28T16:46:21.735+0800: [GC pause (G1 Evacuation Pause) (mixed) 332M->302M(512M), 0.0069603 secs]
2020-10-28T16:46:21.744+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 310M->302M(512M), 0.0013595 secs]
2020-10-28T16:46:21.745+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:21.746+0800: [GC concurrent-root-region-scan-end, 0.0001058 secs]
2020-10-28T16:46:21.746+0800: [GC concurrent-mark-start]
2020-10-28T16:46:21.749+0800: [GC concurrent-mark-end, 0.0030290 secs]
2020-10-28T16:46:21.749+0800: [GC remark, 0.0024779 secs]
2020-10-28T16:46:21.751+0800: [GC cleanup 317M->317M(512M), 0.0003671 secs]
2020-10-28T16:46:21.778+0800: [GC pause (G1 Evacuation Pause) (young) 416M->332M(512M), 0.0081940 secs]
2020-10-28T16:46:21.791+0800: [GC pause (G1 Evacuation Pause) (mixed) 351M->305M(512M), 0.0073046 secs]
2020-10-28T16:46:21.805+0800: [GC pause (G1 Evacuation Pause) (mixed) 333M->309M(512M), 0.0034328 secs]
2020-10-28T16:46:21.809+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 311M->309M(512M), 0.0011961 secs]
2020-10-28T16:46:21.810+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:21.810+0800: [GC concurrent-root-region-scan-end, 0.0001338 secs]
2020-10-28T16:46:21.810+0800: [GC concurrent-mark-start]
2020-10-28T16:46:21.813+0800: [GC concurrent-mark-end, 0.0031663 secs]
2020-10-28T16:46:21.814+0800: [GC remark, 0.0018013 secs]
2020-10-28T16:46:21.815+0800: [GC cleanup 319M->319M(512M), 0.0003320 secs]
2020-10-28T16:46:21.838+0800: [GC pause (G1 Evacuation Pause) (young) 415M->338M(512M), 0.0059352 secs]
2020-10-28T16:46:21.847+0800: [GC pause (G1 Evacuation Pause) (mixed) 354M->312M(512M), 0.0081947 secs]
2020-10-28T16:46:21.856+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 316M->312M(512M), 0.0014452 secs]
2020-10-28T16:46:21.858+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:21.858+0800: [GC concurrent-root-region-scan-end, 0.0001532 secs]
2020-10-28T16:46:21.858+0800: [GC concurrent-mark-start]
2020-10-28T16:46:21.861+0800: [GC concurrent-mark-end, 0.0031667 secs]
2020-10-28T16:46:21.861+0800: [GC remark, 0.0023070 secs]
2020-10-28T16:46:21.864+0800: [GC cleanup 325M->325M(512M), 0.0003616 secs]
2020-10-28T16:46:21.887+0800: [GC pause (G1 Evacuation Pause) (young) 412M->337M(512M), 0.0068273 secs]
2020-10-28T16:46:21.898+0800: [GC pause (G1 Evacuation Pause) (mixed) 353M->321M(512M), 0.0093538 secs]
2020-10-28T16:46:21.909+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 327M->321M(512M), 0.0016501 secs]
2020-10-28T16:46:21.910+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:21.910+0800: [GC concurrent-root-region-scan-end, 0.0001449 secs]
2020-10-28T16:46:21.910+0800: [GC concurrent-mark-start]
2020-10-28T16:46:21.914+0800: [GC concurrent-mark-end, 0.0037727 secs]
2020-10-28T16:46:21.914+0800: [GC remark, 0.0027301 secs]
2020-10-28T16:46:21.918+0800: [GC cleanup 340M->340M(512M), 0.0007481 secs]
2020-10-28T16:46:21.937+0800: [GC pause (G1 Evacuation Pause) (young) 410M->347M(512M), 0.0063666 secs]
2020-10-28T16:46:21.947+0800: [GC pause (G1 Evacuation Pause) (mixed) 367M->331M(512M), 0.0101208 secs]
2020-10-28T16:46:21.958+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 332M->332M(512M), 0.0012628 secs]
2020-10-28T16:46:21.959+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:21.959+0800: [GC concurrent-root-region-scan-end, 0.0001216 secs]
2020-10-28T16:46:21.959+0800: [GC concurrent-mark-start]
2020-10-28T16:46:21.963+0800: [GC concurrent-mark-end, 0.0035433 secs]
2020-10-28T16:46:21.963+0800: [GC remark, 0.0018159 secs]
2020-10-28T16:46:21.965+0800: [GC cleanup 352M->352M(512M), 0.0003103 secs]
2020-10-28T16:46:21.980+0800: [GC pause (G1 Evacuation Pause) (young) 411M->358M(512M), 0.0056711 secs]
2020-10-28T16:46:21.988+0800: [GC pause (G1 Evacuation Pause) (mixed) 375M->337M(512M), 0.0075505 secs]
2020-10-28T16:46:22.002+0800: [GC pause (G1 Evacuation Pause) (mixed) 363M->344M(512M), 0.0037581 secs]
2020-10-28T16:46:22.006+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 346M->345M(512M), 0.0016331 secs]
2020-10-28T16:46:22.008+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:22.008+0800: [GC concurrent-root-region-scan-end, 0.0001425 secs]
2020-10-28T16:46:22.008+0800: [GC concurrent-mark-start]
2020-10-28T16:46:22.012+0800: [GC concurrent-mark-end, 0.0038280 secs]
2020-10-28T16:46:22.012+0800: [GC remark, 0.0024720 secs]
2020-10-28T16:46:22.014+0800: [GC cleanup 365M->365M(512M), 0.0005902 secs]
2020-10-28T16:46:22.026+0800: [GC pause (G1 Evacuation Pause) (young) 402M->359M(512M), 0.0038351 secs]
2020-10-28T16:46:22.035+0800: [GC pause (G1 Evacuation Pause) (mixed) 384M->345M(512M), 0.0092160 secs]
2020-10-28T16:46:22.051+0800: [GC pause (G1 Evacuation Pause) (mixed) 374M->356M(512M), 0.0056640 secs]
2020-10-28T16:46:22.057+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 357M->356M(512M), 0.0013548 secs]
2020-10-28T16:46:22.058+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:22.058+0800: [GC concurrent-root-region-scan-end, 0.0000312 secs]
2020-10-28T16:46:22.058+0800: [GC concurrent-mark-start]
2020-10-28T16:46:22.062+0800: [GC concurrent-mark-end, 0.0035560 secs]
2020-10-28T16:46:22.062+0800: [GC remark, 0.0022683 secs]
2020-10-28T16:46:22.064+0800: [GC cleanup 372M->372M(512M), 0.0004749 secs]
2020-10-28T16:46:22.074+0800: [GC pause (G1 Evacuation Pause) (young) 401M->369M(512M), 0.0030377 secs]
2020-10-28T16:46:22.082+0800: [GC pause (G1 Evacuation Pause) (mixed) 395M->352M(512M), 0.0095602 secs]
2020-10-28T16:46:22.098+0800: [GC pause (G1 Evacuation Pause) (mixed) 379M->363M(512M), 0.0048417 secs]
2020-10-28T16:46:22.103+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 363M->363M(512M), 0.0011420 secs]
2020-10-28T16:46:22.104+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:22.104+0800: [GC concurrent-root-region-scan-end, 0.0001141 secs]
2020-10-28T16:46:22.104+0800: [GC concurrent-mark-start]
2020-10-28T16:46:22.107+0800: [GC concurrent-mark-end, 0.0028055 secs]
2020-10-28T16:46:22.107+0800: [GC remark, 0.0022256 secs]
2020-10-28T16:46:22.109+0800: [GC cleanup 378M->378M(512M), 0.0003273 secs]
2020-10-28T16:46:22.114+0800: [GC pause (G1 Evacuation Pause) (young) 398M->370M(512M), 0.0028209 secs]
2020-10-28T16:46:22.122+0800: [GC pause (G1 Evacuation Pause) (mixed) 396M->363M(512M), 0.0083980 secs]
2020-10-28T16:46:22.131+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 364M->363M(512M), 0.0014365 secs]
2020-10-28T16:46:22.132+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:22.132+0800: [GC concurrent-root-region-scan-end, 0.0000154 secs]
2020-10-28T16:46:22.132+0800: [GC concurrent-mark-start]
2020-10-28T16:46:22.136+0800: [GC concurrent-mark-end, 0.0038212 secs]
2020-10-28T16:46:22.136+0800: [GC remark, 0.0028265 secs]
2020-10-28T16:46:22.139+0800: [GC cleanup 381M->381M(512M), 0.0005388 secs]
2020-10-28T16:46:22.143+0800: [GC pause (G1 Evacuation Pause) (young) 394M->367M(512M), 0.0026247 secs]
2020-10-28T16:46:22.153+0800: [GC pause (G1 Evacuation Pause) (mixed) 395M->360M(512M), 0.0080108 secs]
2020-10-28T16:46:22.162+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 363M->360M(512M), 0.0013884 secs]
2020-10-28T16:46:22.163+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:22.163+0800: [GC concurrent-root-region-scan-end, 0.0000217 secs]
2020-10-28T16:46:22.163+0800: [GC concurrent-mark-start]
2020-10-28T16:46:22.168+0800: [GC concurrent-mark-end, 0.0045969 secs]
2020-10-28T16:46:22.168+0800: [GC remark, 0.0020709 secs]
2020-10-28T16:46:22.171+0800: [GC cleanup 378M->378M(512M), 0.0003048 secs]
2020-10-28T16:46:22.176+0800: [GC pause (G1 Evacuation Pause) (young) 400M->375M(512M), 0.0047359 secs]
2020-10-28T16:46:22.187+0800: [GC pause (G1 Evacuation Pause) (mixed) 402M->370M(512M), 0.0066951 secs]
2020-10-28T16:46:22.194+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 371M->370M(512M), 0.0013532 secs]
2020-10-28T16:46:22.195+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:22.195+0800: [GC concurrent-root-region-scan-end, 0.0000213 secs]
2020-10-28T16:46:22.195+0800: [GC concurrent-mark-start]
2020-10-28T16:46:22.199+0800: [GC concurrent-mark-end, 0.0036985 secs]
2020-10-28T16:46:22.199+0800: [GC remark, 0.0040770 secs]
2020-10-28T16:46:22.203+0800: [GC cleanup 385M->385M(512M), 0.0006549 secs]
2020-10-28T16:46:22.208+0800: [GC pause (G1 Evacuation Pause) (young) 402M->375M(512M), 0.0031979 secs]
2020-10-28T16:46:22.219+0800: [GC pause (G1 Evacuation Pause) (mixed) 398M->363M(512M), 0.0072979 secs]
2020-10-28T16:46:22.228+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 373M->367M(512M), 0.0020792 secs]
2020-10-28T16:46:22.230+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:46:22.230+0800: [GC concurrent-root-region-scan-end, 0.0001583 secs]
2020-10-28T16:46:22.230+0800: [GC concurrent-mark-start]
2020-10-28T16:46:22.235+0800: [GC concurrent-mark-end, 0.0048291 secs]
2020-10-28T16:46:22.235+0800: [GC remark, 0.0020622 secs]
2020-10-28T16:46:22.237+0800: [GC cleanup 384M->384M(512M), 0.0002933 secs]
2020-10-28T16:46:22.240+0800: [GC pause (G1 Evacuation Pause) (young) 392M->373M(512M), 0.0029879 secs]
2020-10-28T16:46:22.248+0800: [GC pause (G1 Evacuation Pause) (mixed) 404M->368M(512M), 0.0083886 secs]
执行结束!共生成对象次数:8382
```

Xmx调大后，没有发生OOM，没有发生Full GC，GC频率较高

---

## -Xms1g -Xmx1g

```
$ java -XX:+PrintGC -XX:+PrintGCDateStamps -Xms1g -Xmx1g -XX:+UseG1GC GCLogAnalysis
正在执行...
2020-10-28T16:49:02.323+0800: [GC pause (G1 Evacuation Pause) (young) 62M->23M(1024M), 0.0069477 secs]
2020-10-28T16:49:02.348+0800: [GC pause (G1 Evacuation Pause) (young) 78M->40M(1024M), 0.0055096 secs]
2020-10-28T16:49:02.375+0800: [GC pause (G1 Evacuation Pause) (young) 97M->61M(1024M), 0.0072004 secs]
2020-10-28T16:49:02.398+0800: [GC pause (G1 Evacuation Pause) (young) 113M->78M(1024M), 0.0051705 secs]
2020-10-28T16:49:02.429+0800: [GC pause (G1 Evacuation Pause) (young) 151M->105M(1024M), 0.0088690 secs]
2020-10-28T16:49:02.464+0800: [GC pause (G1 Evacuation Pause) (young) 187M->133M(1024M), 0.0080988 secs]
2020-10-28T16:49:02.518+0800: [GC pause (G1 Evacuation Pause) (young) 267M->166M(1024M), 0.0123725 secs]
2020-10-28T16:49:02.558+0800: [GC pause (G1 Evacuation Pause) (young) 289M->203M(1024M), 0.0109699 secs]
2020-10-28T16:49:02.639+0800: [GC pause (G1 Evacuation Pause) (young) 423M->265M(1024M), 0.0183858 secs]
2020-10-28T16:49:02.703+0800: [GC pause (G1 Evacuation Pause) (young) 458M->317M(1024M), 0.0174893 secs]
2020-10-28T16:49:02.777+0800: [GC pause (G1 Evacuation Pause) (young) 557M->373M(1024M), 0.0244149 secs]
2020-10-28T16:49:02.855+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 599M->433M(1024M), 0.0205490 secs]
2020-10-28T16:49:02.876+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:49:02.876+0800: [GC concurrent-root-region-scan-end, 0.0003020 secs]
2020-10-28T16:49:02.876+0800: [GC concurrent-mark-start]
2020-10-28T16:49:02.881+0800: [GC concurrent-mark-end, 0.0052724 secs]
2020-10-28T16:49:02.881+0800: [GC remark, 0.0017906 secs]
2020-10-28T16:49:02.883+0800: [GC cleanup 452M->435M(1024M), 0.0006119 secs]
2020-10-28T16:49:02.884+0800: [GC concurrent-cleanup-start]
2020-10-28T16:49:02.884+0800: [GC concurrent-cleanup-end, 0.0000478 secs]
2020-10-28T16:49:02.958+0800: [GC pause (G1 Evacuation Pause) (young) 711M->478M(1024M), 0.0313200 secs]
2020-10-28T16:49:02.992+0800: [GC pause (G1 Evacuation Pause) (mixed) 495M->398M(1024M), 0.0117183 secs]
2020-10-28T16:49:03.018+0800: [GC pause (G1 Evacuation Pause) (mixed) 461M->412M(1024M), 0.0045744 secs]
2020-10-28T16:49:03.023+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 416M->413M(1024M), 0.0023733 secs]
2020-10-28T16:49:03.025+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:49:03.026+0800: [GC concurrent-root-region-scan-end, 0.0001441 secs]
2020-10-28T16:49:03.026+0800: [GC concurrent-mark-start]
2020-10-28T16:49:03.029+0800: [GC concurrent-mark-end, 0.0038078 secs]
2020-10-28T16:49:03.030+0800: [GC remark, 0.0025470 secs]
2020-10-28T16:49:03.032+0800: [GC cleanup 425M->420M(1024M), 0.0006328 secs]
2020-10-28T16:49:03.033+0800: [GC concurrent-cleanup-start]
2020-10-28T16:49:03.033+0800: [GC concurrent-cleanup-end, 0.0000221 secs]
2020-10-28T16:49:03.123+0800: [GC pause (G1 Evacuation Pause) (young) 788M->491M(1024M), 0.0255009 secs]
2020-10-28T16:49:03.151+0800: [GC pause (G1 Evacuation Pause) (mixed) 505M->439M(1024M), 0.0128576 secs]
2020-10-28T16:49:03.164+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 440M->440M(1024M), 0.0016825 secs]
2020-10-28T16:49:03.166+0800: [GC concurrent-root-region-scan-start]
2020-10-28T16:49:03.166+0800: [GC concurrent-root-region-scan-end, 0.0001540 secs]
2020-10-28T16:49:03.166+0800: [GC concurrent-mark-start]
2020-10-28T16:49:03.172+0800: [GC concurrent-mark-end, 0.0046467 secs]
2020-10-28T16:49:03.172+0800: [GC remark, 0.0027112 secs]
2020-10-28T16:49:03.175+0800: [GC cleanup 461M->459M(1024M), 0.0006592 secs]
2020-10-28T16:49:03.175+0800: [GC concurrent-cleanup-start]
2020-10-28T16:49:03.175+0800: [GC concurrent-cleanup-end, 0.0000213 secs]
执行结束!共生成对象次数:9484
```

Xmx调大到1g后，GC频率明显减少，生成对象数没有显著提升

---

## -Xms4g -Xmx4g

```
$ java -XX:+PrintGC -XX:+PrintGCDateStamps -Xms4g -Xmx4g -XX:+UseG1GC GCLogAnalysis
正在执行...
2020-10-28T16:50:41.342+0800: [GC pause (G1 Evacuation Pause) (young) 204M->70M(4096M), 0.0195057 secs]
2020-10-28T16:50:41.397+0800: [GC pause (G1 Evacuation Pause) (young) 248M->123M(4096M), 0.0196904 secs]
2020-10-28T16:50:41.456+0800: [GC pause (G1 Evacuation Pause) (young) 301M->181M(4096M), 0.0219591 secs]
2020-10-28T16:50:41.515+0800: [GC pause (G1 Evacuation Pause) (young) 359M->238M(4096M), 0.0210993 secs]
2020-10-28T16:50:41.573+0800: [GC pause (G1 Evacuation Pause) (young) 416M->296M(4096M), 0.0230127 secs]
2020-10-28T16:50:41.630+0800: [GC pause (G1 Evacuation Pause) (young) 474M->358M(4096M), 0.0222425 secs]
2020-10-28T16:50:41.686+0800: [GC pause (G1 Evacuation Pause) (young) 536M->424M(4096M), 0.0231667 secs]
2020-10-28T16:50:41.748+0800: [GC pause (G1 Evacuation Pause) (young) 602M->491M(4096M), 0.0213212 secs]
2020-10-28T16:50:41.810+0800: [GC pause (G1 Evacuation Pause) (young) 669M->555M(4096M), 0.0209047 secs]
2020-10-28T16:50:41.866+0800: [GC pause (G1 Evacuation Pause) (young) 737M->613M(4096M), 0.0195250 secs]
2020-10-28T16:50:41.938+0800: [GC pause (G1 Evacuation Pause) (young) 853M->698M(4096M), 0.0292147 secs]
2020-10-28T16:50:42.014+0800: [GC pause (G1 Evacuation Pause) (young) 952M->789M(4096M), 0.0353200 secs]
2020-10-28T16:50:42.102+0800: [GC pause (G1 Evacuation Pause) (young) 1071M->879M(4096M), 0.0339609 secs]
执行结束!共生成对象次数:10876
```

Xmx调大到4g后，没有发生Full GC，GC次数很少，生成对象数提升

---

# 总结

|  | GC | Full Gc次数 | 对象数
| - | - | - | - |
| 512m | SerialGC | 1 | 7982 |
|  | ParallelGC | 6 | 7236 |
|  | ConcMarkSweepGC | 6 | 9403 |
|  | G1GC | 0 | 8382 |
| 1g | SerialGC | 0 | 10402 |
|  | ParallelGC | 1 | 9551 |
|  | ConcMarkSweepGC | 0 | 10386 |
|  | G1GC | 0 | 9484 |
| 4g | SerialGC | 0 | 11085 |
|  | ParallelGC | 0 | 11846 |
|  | ConcMarkSweepGC | 0 | 9357 |
|  | G1GC | 0 | 10876 |
