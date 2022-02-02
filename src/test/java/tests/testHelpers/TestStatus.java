package tests.testHelpers;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/************************************************************************
 Description : Helper class used for check test execution status (pass/fail)
 Created by : Tomasz Zulawnik

 Class History
 -------------------------------------------------------------------------
 Date 		Author		 							    Reason
 2022-02-02	Tomasz Zulawnik                             Class created
 ************************************************************************/

public class TestStatus implements AfterTestExecutionCallback {
    public boolean isFailed;
    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        isFailed = extensionContext.getExecutionException().isPresent();
    }
}
