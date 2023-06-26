open module m2 {
    exports com.m2 to m1,jdepsM;
    exports services;
    provides services.service1 with servicesImpli.service1Impl;

}