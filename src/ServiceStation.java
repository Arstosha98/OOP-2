public class ServiceStation {
    public void check(ServiceAble serviceAble) {
        serviceAble.service();
    }
    public void checkAll(ServiceAble[] serviceAbles){
        for (ServiceAble serviceAble : serviceAbles){
         serviceAble.service();
        }
    }
}