# Soft_hard_Assertion
1) Assert.assertTrue() & Assert.assertFalse()

Note: Assert true statement fails the test and stop the execution of the test, if the actual output is false. Assert.assertFalse() works opposite of Assert.assertTrue(). It means that if you want your test to continue only if when some certain element is not present on the page. You will use Assert false, so it will fail the test in case of the element present on the page.

2) Assert.assertEquals() It also works the same way like assert true and assert fail. It will also stop the execution, if the value is not equal and carry on the execution, if the value is equal.
3) 
If you need your @Test Method to fail straight away after one of its Asserts fails, you need to use Hard Asserts.

But if you want the execution to proceed even if some assert fails, if you want to see how the following asserts will behave and you want to see the full result at the end of the test, then you need to use Soft Asserts

