package com.github.stricklerxc.pipeline

import com.github.stricklerxc.pipeline.mocks.OpenShiftMock
import com.lesfurets.jenkins.unit.BasePipelineTest

import org.junit.Before
import org.junit.Test

import static groovy.test.GroovyAssert.assertEquals

class TestExample extends BasePipelineTest {
    def example

    @Override
    @Before
    void setUp() throws Exception {
        super.setUp()

        // Mock Openshift global variable
        binding.openshift = new OpenShiftMock()

        // Setup class under test
        example = new Example(binding)
    }

    @Test
    void testGetClusterUrl() {
        String result = example.getClusterUrl("nonprod", "default")

        assertEquals("nonprod.cluster.com", result)
    }

    @Test
    void testGetProject() {
        String result = example.getProject("nonprod", "non-default")

        assertEquals("non-default", result)
    }
}
