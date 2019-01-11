package chap07;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAspect {
	
	private Map<Long, Object> cache = new HashMap<>();
	
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("start+CacheAspect");
		Long num = (Long) joinPoint.getArgs()[0];
		System.out.println(num+"=================");
		if (cache.containsKey(num)){
			System.out.printf("CacheAspect: Cache에서 구함[%d]\n", num);
			return cache.get(num);
		}
		
		Object result = joinPoint.proceed();
		cache.put(num, result);
		System.out.printf("CacheAspect: Cache에 추가[%d]\n", num);
		return result;
	}

}
