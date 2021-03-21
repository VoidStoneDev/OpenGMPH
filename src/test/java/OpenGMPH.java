import org.gradle.api.Plugin;
import org.gradle.api.Project;

@SuppressWarnings("unused")
public class OpenGMPH implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        TempExt t = project.getExtensions().create("temp", TempExt.class);
        project.afterEvaluate(project1 -> {
            t.clos.setDelegate(t.hmm);
            t.clos.call();
            System.out.println(((TempExt.Temp) t.hmm).t);
        });

    }
}
