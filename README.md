# XposedStudy
Xposed初探，学习Xposed hook技术

注意：
1.Xposed本身需要Root，这里借助[VirtualXposed](https://github.com/android-hacker/VirtualXposed)，需要下载[VirtualXposed安装包](https://github.com/android-hacker/VirtualXposed/releases)

2.下载XposedBridgeApi jar包，放在moudle下新建的文件夹中（不能放在libs），在gradle中添加 compileOnly fileTree(dir: 'mylib', include: ['*.jar'])  
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

