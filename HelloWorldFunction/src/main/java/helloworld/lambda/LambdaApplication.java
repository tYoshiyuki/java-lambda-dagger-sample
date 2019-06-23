package helloworld.lambda;

import helloworld.service.AppService;

import javax.inject.Inject;

public class LambdaApplication {
    private AppService appService;

    @Inject
    public LambdaApplication(AppService appService) {
        this.appService = appService;
    }
}
