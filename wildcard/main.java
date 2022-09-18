import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String args[]) {
        BaseWork work = new BaseWork();
        DetailWork detailWork = new DetailWork();

        startJob(work); // Valid!
        startJob(detailWork); // Valid, polymorphism magic.

        List<BaseWork> works = new ArrayList<>();
        List<DetailWork> detailWorks = new ArrayList<>();

        startJob(works);
        startJob(detailWorks);
    }
    private static void startJob(BaseWork incomingWork) {
        incomingWork.run();
    }

    private static void startJob(List<? extends BaseWork> incomingWorks) {
        for(BaseWork incomingWork : incomingWorks) {
            incomingWork.run();
        }
    }
}
