module com.java9.example.demo {
    exports com.java9.example.demo;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires java.sql;
    opens com.java9.example.demo to spring.core;
}