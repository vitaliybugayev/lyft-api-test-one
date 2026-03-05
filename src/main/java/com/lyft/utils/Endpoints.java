package com.lyft.utils;

public final class Endpoints {

    private Endpoints() {
        throw new IllegalStateException("Utility class");
    }

    public static final String BASE_URL = ProjectConfiguration.getProperty("base.url");

    public static final String IP_URI = BASE_URL + "/ip";
    public static final String POST_URI = BASE_URL + "/post";
    public static final String PUT_URI = BASE_URL + "/put";
    public static final String DELETE_URI = BASE_URL + "/delete";
    public static final String HEADERS_URI = BASE_URL + "/headers";
}
