package aspect2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MHAspect {

	@Pointcut("execution(public * chap07..*(..))")
	public void pointCut() {
		
	}
	
	@Around("pointCut()")
	public Object join(ProceedingJoinPoint joinPoint) {
		long start = System.nanoTime();
		try {
			Object result = joinPoint.proceed();
			return result;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("start = "+ start);
		}
		return start;
	}
}
