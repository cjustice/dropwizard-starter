package io.cjustice;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropWizardApp extends Application<DropWizardConfig> {

    public static void main(final String[] args) throws Exception {
        new DropWizardApp().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-starter";
    }

    @Override
    public void initialize(final Bootstrap bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropWizardConfig configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
