package org.jjad.quarkus.starting;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CustomMain {

    public static void main(String[] args) {
        Quarkus.run(CustomApplication.class, args);
    }

    public static class CustomApplication implements QuarkusApplication{

        @Override
        public int run(String... args) throws Exception {
            System.out.println("***************************************************");
            System.out.println("running main method");
            System.out.println("***************************************************");
            Quarkus.waitForExit();
            return 0;
        }
    }

}
