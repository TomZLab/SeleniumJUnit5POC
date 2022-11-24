package tests.testHelpers;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TestStatus implements AfterTestExecutionCallback {
    public boolean isFailed;
    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        isFailed = extensionContext.getExecutionException().isPresent();
    }
}
