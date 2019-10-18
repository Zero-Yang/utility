package com.utils.system;

import com.utils.SystemUtils;

public class JavaInfo {

    private String javaVersion = SystemUtils.getJavaVersion();

    private String javaVendor = SystemUtils.getJavaVendor();

    private String javaVendorUrl = SystemUtils.getJavaVendorUrl();

    public JavaInfo() {
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getJavaVendor() {
        return javaVendor;
    }

    public void setJavaVendor(String javaVendor) {
        this.javaVendor = javaVendor;
    }

    public String getJavaVendorUrl() {
        return javaVendorUrl;
    }

    public void setJavaVendorUrl(String javaVendorUrl) {
        this.javaVendorUrl = javaVendorUrl;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Java Version:====").
                append(getJavaVersion()).
                append("\n").
                append("Java Vendor:====").
                append(getJavaVendor()).
                append("\n").
                append("Java VendorUrl:====").
                append(getJavaVendorUrl()).
                append("\n");

        return builder.toString();
    }
}
