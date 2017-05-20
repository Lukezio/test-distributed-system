package de.lm.ttt;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.lm.ttt.usermanagement.junit.AllUserManagementServiceTests;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	AllUserManagementServiceTests.class
})

public class AllComponentsTests {

}
