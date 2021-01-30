package com.github.stricklerxc.pipeline

class Example implements Serializable {
    def steps

    public Example(steps) {
        // Allow class to use pipeline steps from: https://www.jenkins.io/doc/pipeline/steps/
        this.steps = steps
    }

    public String getClusterUrl() {
        return steps.openshift.cluster()
    }
}
