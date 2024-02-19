package talentLMSTest;

import com.fall23.talentLMS.page.TrainingMatrixPage;
import org.testng.annotations.Test;

public class TrainingMatrixTest {
    TrainingMatrixPage trainingMatrixPage = new TrainingMatrixPage();

    @Test
    public void test23(){
        trainingMatrixPage.listOfAllElements();

    }
}
