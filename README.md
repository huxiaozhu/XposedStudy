# XposedStudy
Xposed初探，学习Xposed hook技术

注意：
1.Xposed本身需要Root，这里借助[VirtualXposed](https://github.com/android-hacker/VirtualXposed)，需要下载[VirtualXposed安装包](https://github.com/android-hacker/VirtualXposed/releases)

2.下载XposedBridgeApi jar包，放在moudle下新建的文件夹中（不能放在libs），在gradle中添加 provided fileTree(dir: 'mylib', include: ['*.jar'])
