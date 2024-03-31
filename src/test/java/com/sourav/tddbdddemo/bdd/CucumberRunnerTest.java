package com.sourav.tddbdddemo.bdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines("cucumber")
@SelectPackages("com.sourav.tddbdddemo.bdd")
class CucumberRunnerTest {

    @Test
    void testCucumberWorks() {
        Assertions.assertThat(this.getClass().getAnnotations()).isNotEmpty();
    }
}