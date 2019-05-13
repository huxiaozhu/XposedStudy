package com.example.xposed.utils

import de.robv.android.xposed.*
import de.robv.android.xposed.callbacks.XC_LoadPackage

class XposedHookUtil : IXposedHookLoadPackage {
    val className = "com.example.testxposed.MainActivity"
    override fun handleLoadPackage(loadPackageParam: XC_LoadPackage.LoadPackageParam?) {
        XposedBridge.log("Xposed 获取到包名${loadPackageParam?.packageName}:")
        if (loadPackageParam?.packageName == "com.example.testxposed") {
            XposedBridge.log("Xposed 获取到测试app:")
            XposedHelpers.findAndHookMethod(
                className,
                loadPackageParam.classLoader,
                "getChange",
                object : XC_MethodHook() {
                    override fun afterHookedMethod(param: MethodHookParam?) {
                        super.afterHookedMethod(param)
                        XposedBridge.log("Xposed beforeHookedMethod result:${param?.result}")
                    }

                    override fun beforeHookedMethod(param: MethodHookParam?) {
                        super.beforeHookedMethod(param)
                        // 修改被Hook操作的目标类方法的函数返回值
                        param?.result = "Hello Xposed"

                        // 打印被Hook操作的目标类方法的函数返回值ֵ
                        XposedBridge.log("Xposed afterHookedMethod 函数返回值:${param?.result}")
                    }
                })
        }

    }
}