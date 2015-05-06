package io.fabric8.config;

import io.sundr.builder.annotations.ExternalBuildables;

@ExternalBuildables(validationEnabled = true, builderPackage = "io.fabric8.common", value = {
        "io.fabric8.openshift.api.model.Build",
        "io.fabric8.openshift.api.model.BuildConfig",
        "io.fabric8.openshift.api.model.BuildConfigList",
        "io.fabric8.openshift.api.model.BuildConfigSpec",
        "io.fabric8.openshift.api.model.BuildList",
        "io.fabric8.openshift.api.model.BuildOutput",
        "io.fabric8.openshift.api.model.BuildParameters",
        "io.fabric8.openshift.api.model.BuildSource",
        "io.fabric8.openshift.api.model.BuildSpec",
        "io.fabric8.openshift.api.model.BuildStrategy",
        "io.fabric8.openshift.api.model.BuildTriggerPolicy",
        "io.fabric8.openshift.api.model.CustomBuildStrategy",
        "io.fabric8.openshift.api.model.CustomDeploymentStrategyParams",
        "io.fabric8.openshift.api.model.Deployment",
        "io.fabric8.openshift.api.model.DeploymentCause",
        "io.fabric8.openshift.api.model.DeploymentCauseImageTrigger",
        "io.fabric8.openshift.api.model.DeploymentConfig",
        "io.fabric8.openshift.api.model.DeploymentConfigList",
        "io.fabric8.openshift.api.model.DeploymentConfigSpec",
        "io.fabric8.openshift.api.model.DeploymentDetails",
        "io.fabric8.openshift.api.model.DeploymentList",
        "io.fabric8.openshift.api.model.DeploymentStrategy",
        "io.fabric8.openshift.api.model.DeploymentTemplate",
        "io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams",
        "io.fabric8.openshift.api.model.DeploymentTriggerPolicy",
        "io.fabric8.openshift.api.model.DockerBuildStrategy",
        "io.fabric8.openshift.api.model.DockerConfig",
        "io.fabric8.openshift.api.model.DockerImage",
        "io.fabric8.openshift.api.model.ExecNewPodHook",
        "io.fabric8.openshift.api.model.GitBuildSource",
        "io.fabric8.openshift.api.model.GitSourceRevision",
        "io.fabric8.openshift.api.model.Image",
        "io.fabric8.openshift.api.model.ImageChangeTrigger",
        "io.fabric8.openshift.api.model.ImageList",
        "io.fabric8.openshift.api.model.ImageStream",
        "io.fabric8.openshift.api.model.ImageStreamList",
        "io.fabric8.openshift.api.model.ImageStreamSpec",
        "io.fabric8.openshift.api.model.ImageStreamStatus",
        "io.fabric8.openshift.api.model.LifecycleHook",
        "io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams",
        "io.fabric8.openshift.api.model.Route",
        "io.fabric8.openshift.api.model.RouteList",
        "io.fabric8.openshift.api.model.RouteSpec",
        "io.fabric8.openshift.api.model.STIBuildStrategy",
        "io.fabric8.openshift.api.model.SourceControlUser",
        "io.fabric8.openshift.api.model.SourceRevision",
        "io.fabric8.openshift.api.model.TLSConfig",
        "io.fabric8.openshift.api.model.TagEvent",
        "io.fabric8.openshift.api.model.TagEventList",
        "io.fabric8.openshift.api.model.WebHookTrigger",
        "io.fabric8.openshift.api.model.config.Config",
        "io.fabric8.openshift.api.model.template.Template",
        "io.fabric8.openshift.api.model.template.Parameter",
        "io.fabric8.openshift.api.model.OAuthClient",
        "io.fabric8.openshift.api.model.OAuthAccessToken",
        "io.fabric8.openshift.api.model.OAuthAuthorizeToken",
        "io.fabric8.openshift.api.model.OAuthClientAuthorization",
        "io.fabric8.openshift.api.model.OAuthAccessTokenList",
        "io.fabric8.openshift.api.model.OAuthAuthorizeTokenList",
        "io.fabric8.openshift.api.model.OAuthClientList",
        "io.fabric8.openshift.api.model.OAuthClientAuthorizationList"
})
public class OpenshiftConfig {
}
