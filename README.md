# Uncommon Java Bug: Unexpected Loop Termination

This repository demonstrates an uncommon bug in Java involving the unexpected termination of a loop using `System.exit()`. This approach is generally discouraged because it bypasses normal exception handling mechanisms, potentially leading to resource leaks and unpredictable program behavior.  The `UncommonBug.java` file contains the buggy code, while `UncommonBugSolution.java` provides a corrected version.

**Problem:** The loop in `UncommonBug.java` uses `System.exit(0)` to stop execution. This is problematic because it doesn't allow for proper cleanup of resources or the execution of finally blocks in try-catch statements, leading to potential resource leaks and unexpected behavior.

**Solution:** The corrected code in `UncommonBugSolution.java` uses a `break` statement to exit the loop gracefully, maintaining proper program control flow.