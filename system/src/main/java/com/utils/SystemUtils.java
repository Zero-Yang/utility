package com.utils;

import com.utils.system.SystemProperties;

/**
 * 获取系统相关信息
 */
public class SystemUtils {

    /**
     * 运行时环境规范名称
     * @return
     */
    public static String getJavaSpecificationName(){
        return System.getProperty(SystemProperties.JAVA_SPECIFICATION_NAME);
    }

    /**
     * 运行时环境版本
     * @return
     */
    public static String getJavaVersion(){
        return System.getProperty(SystemProperties.JAVA_VERSION);
    }

    /**
     * 运行时环境规范版本
     * @return
     */
    public static String getJavaSpecificationVersion(){
        return System.getProperty(SystemProperties.JAVA_SPECIFICATION_VERSION);
    }

    /**
     * 运行时环境供应商
     * @return
     */
    public static String getJavaVendor(){
        return System.getProperty(SystemProperties.JAVA_VENDOR);
    }

    /**
     *  运行时环境规范供应商
     * @return
     */
    public static String getJavaSpecificationVendor(){
        return System.getProperty(SystemProperties.JAVA_SPECIFICATION_VENDOR);
    }

    public static String getJavaVendorUrl(){
        return System.getProperty(SystemProperties.Java_VENDOR_URL);
    }

    public static String getJavaHoMe(){
        return System.getProperty(SystemProperties.Java_HOME);
    }

    public static String getLibraryPath(){
        return System.getProperty(SystemProperties.JAVA_LIBRARY_PATH);
    }

    public static String getJavaTmpdir(){
        return System.getProperty(SystemProperties.JAVA_TMPDIR);
    }

    public static String getJavaCompiler(){
        return System.getProperty(SystemProperties.JAVA_COMPILER);
    }

    public static String getJavaExtDirs(){
        return System.getProperty(SystemProperties.JAVA_EXT_DIRS);
    }

    public static String getJavaVmName(){
        return System.getProperty(SystemProperties.JAVA_VM_NAME);
    }

    public static String getJavaVmSpecificationName(){
        return System.getProperty(SystemProperties.JAVA_VM_SPECIFICATION_NAME);
    }

    public static String getJavaVmVersion(){
        return System.getProperty(SystemProperties.JAVA_VM_VERSION);
    }

    public static String getJavaVmSpecificationVersion(){
        return System.getProperty(SystemProperties.JAVA_VM_SPECIFICATION_VERSION);
    }


    public static String getJavaVmVendor(){
        return System.getProperty(SystemProperties.JAVA_VM_VENDOR);
    }

    public static String getJavaVmSpecificationVendor(){
        return System.getProperty(SystemProperties.JAVA_VM_SPECIFICATION_VENDOR);
    }

    public static String getClassVersion(){
        return System.getProperty(SystemProperties.JAVA_CLASS_VERSION);
    }

    public static String getJavaClassPath(){
        return System.getProperty(SystemProperties.JAVA_CLASS_PATH);
    }

    public static String getOsName(){
        return System.getProperty(SystemProperties.OS_NAME);
    }

    public static String getOsArch(){
        return System.getProperty(SystemProperties.OS_ARCH);
    }

    public static String getOsVersion(){
        return System.getProperty(SystemProperties.OS_VERSION);
    }

    public static String getFileSeparator(){
        return System.getProperty(SystemProperties.FILE_SEPARATOR);
    }

    public static String getPathSeparator(){
        return System.getProperty(SystemProperties.PATH_SEPARATOR);
    }

    public static String LineSeparator(){
        return System.getProperty(SystemProperties.LINE_SEPARATOR);
    }

    public static String getUserName(){
        return System.getProperty(SystemProperties.USER_NAME);
    }

    public static String getUserHome(){
        return System.getProperty(SystemProperties.USER_HOME);
    }

    public static String getJavaRuntimeName(){
        return System.getProperty(SystemProperties.JAVA_RUNTIME_NAME);
    }

    public static String getJavaRuntimeVersion(){
        return System.getProperty(SystemProperties.JAVA_RUNTIME_VERSION);
    }

    public static String getSunBootClassPath(){
        return System.getProperty(SystemProperties.SUN_BOOT_CLASS_PATH);
    }

    public static String getSunArchDataModel(){
        return System.getProperty(SystemProperties.SUN_ARCH_DATA_MODEL);
    }

    public static String getJavaEndorsedDirs(){
        return System.getProperty(SystemProperties.JAVA_ENDORSED_DIRS);
    }

    public static String getJavaProtocolHandlerPkgs(){
        return System.getProperty(SystemProperties.JAVA_PROTOCOL_HANDLER_PKGS);
    }


}
