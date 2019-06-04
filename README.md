# XposedStudy
Xposed初探，学习Xposed hook技术

注意：
1.Xposed本身需要Root，这里借助[VirtualXposed](https://github.com/android-hacker/VirtualXposed)，需要下载[VirtualXposed安装包](https://github.com/android-hacker/VirtualXposed/releases)

2.添加Xposed依赖
```
repositories {
    jcenter();
}

dependencies {
    compileOnly 'de.robv.android.xposed:api:82'
}
```  
3.在manifest文件下的appliction中添加meta-data标签
```xml
        <meta-data
                android:name="xposedmodule"
                android:value="true"/>
        <meta-data
                android:name="xposeddescription"
                android:value="这是一个xposed应用"/>
        <meta-data
                android:name="xposedminversion"
                android:value="54"/>
```  
4.创建类实现IXposedHookLoadPackage来hook方法（或者其他操作）  
5.在assets中创建xposed_init文件，在文件中指定该类的包名路径

## 关于Xposed API（图片私人所有，使用需要得到本人同意），更多资料请前往[Xposed](https://github.com/rovo89/XposedBridge/wiki/Development-tutorial)
![图片私人所有，使用需要得到本人同意](https://github.com/huxiaozhu/XposedStudy/blob/master/pic/Xposed.png)
