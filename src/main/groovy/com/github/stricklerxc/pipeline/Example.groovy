package com.github.stricklerxc.pipeline

class Example implements Serializable {
    def steps

    public Example(steps) {
        // Allow class to use pipeline steps from: https://www.jenkins.io/doc/pipeline/steps/
        this.steps = steps
    }

    public String getClusterUrl(String clusterId, String project) {
        String clusterUrl

        steps.openshift.withCluster(clusterId) {
            steps.openshift.withProject(project) {
                clusterUrl = steps.openshift.cluster()
            }
        }

        return clusterUrl
    }

    public String getProject(String clusterId, String project) {
        String projectName

        steps.openshift.withCluster(clusterId) {
            steps.openshift.withProject(project) {
                projectName = steps.openshift.project()
            }
        }

        return projectName
    }
}
