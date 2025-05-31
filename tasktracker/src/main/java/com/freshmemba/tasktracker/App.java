package com.freshmemba.tasktracker;

import io.javalin.Javalin;
import io.javalin.plugin.bundled.CorsPluginConfig;

/**
 *
 *
 */
public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.plugins.enableCors(cors -> {
                cors.add(CorsPluginConfig::anyHost);    // Allow all origins
            });
        }).start(7000);

        app.get("/health", ctx -> ctx.result("OK"));
    }
}