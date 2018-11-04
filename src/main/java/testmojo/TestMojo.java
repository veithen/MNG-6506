package testmojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name="test")
public class TestMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        TestAnnotation ann = TestMojo.class.getPackage().getAnnotation(TestAnnotation.class);
        if (ann == null) {
            throw new MojoFailureException("Failed to retrieve package annotation");
        }
    }
}
