package com.freshmemba.tasktracker;

import io.javalin.Javalin;
import io.javalin.plugin.bundled.CorsPluginConfig;

/**
 * The entry point for the Task Tracker application.
 * Initializes and starts a Javalin web server with CORS enabled for all origins.
 * Exposes a health check endpoint at /health.
 */
public class App {
    /**
     * Main method to start the Javalin server.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            // Enable CORS for all origins
            config.plugins.enableCors(cors -> {
                cors.add(CorsPluginConfig::anyHost);    // Allow all origins
            });
        }).start(7000);

        // Health check endpoint
        app.get("/health", ctx -> ctx.result("OK"));
    }
}