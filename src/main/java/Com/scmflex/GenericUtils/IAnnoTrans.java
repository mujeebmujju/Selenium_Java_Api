package Com.scmflex.GenericUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class IAnnoTrans implements IAnnotationTransformer
{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) 
	{
		annotation.setRetryAnalyzer(Com.scmflex.GenericUtils.RetryImpclass.class);
	   
		
	}
	

}


