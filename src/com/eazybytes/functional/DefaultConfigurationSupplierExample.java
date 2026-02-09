package com.eazybytes.functional;

import java.util.function.Supplier;

class Configuration {
    String url;
    int timeout;

    Configuration(String url, int timeout) {
        this.url = url;
        this.timeout = timeout;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "url='" + url + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}

public class DefaultConfigurationSupplierExample {
    public static void main(String[] args) {
        Supplier<Configuration> defaultConfiguration = ()-> new Configuration("http://localhost:8080/", 5000);

        String url = defaultConfiguration.get().getUrl();
        int timeout = defaultConfiguration.get().getTimeout();

        Configuration configuration = defaultConfiguration.get();

        System.out.println(url);
        System.out.println(timeout);
        System.out.println(configuration);
        System.out.println(defaultConfiguration.get());
        System.out.println(defaultConfiguration.get().toString());
    }
}
