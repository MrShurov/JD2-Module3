package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProvider {
    private String name;
    @Inject
    @CustomAnnotation
    private Set<IInfo> iInfoSet;

    public UserProvider(Provider<IInfo> iInfoProvider){
        iInfoSet = new HashSet<IInfo>();
        for (int i = 0; i < 2; i++){
            iInfoSet.add(iInfoProvider.get());
        }
    }
}
