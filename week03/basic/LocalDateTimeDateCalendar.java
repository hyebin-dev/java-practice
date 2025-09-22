package week03.basic;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class LocalDateTimeDateCalendar {

	public static void main(String[] args) {
		System.out.println("<날짜·시간: LocalDateTime ↔ Date/Calendar 변환>");
//		B-6) 날짜·시간: LocalDateTime ↔ Date/Calendar 변환
//		문제: 현재 로컬 시간(`LocalDateTime.now()`)을 문자열로 포맷하고(`yyyy-MM-dd HH:mm`),
//		이를 다시 파싱해 `Date`와 `Calendar`로 각각 변환한 뒤, 같은 포맷으로 다시 문자열을 만들어라.
//		문제설명: `LocalDateTime`은 타임존 정보가 없다. `ZonedDateTime` 또는 시스템 기본 존을 이용해
//		`Instant`로 만들고 `Date`로 변환할 수 있다. `Calendar`는 `setTime(Date)`로 동기화하여
//		동일 포맷 문자열을 얻는다.
//		힌트: `LocalDateTime`, `DateTimeFormatter`, `ZoneId`, `ZonedDateTime`,
//		`toInstant()/from`, `Date`, `Calendar`.
		
		        LocalDateTime now = LocalDateTime.now(); // 컴퓨터 시간(타임존X-위치라벨)
		        // 포맷팅 : 어떤 모양으로 문자열 만들지(규칙/패턴), 객체 -> 문자열
		        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // fmt -> 포맷 규칙 담겨있음.
		        String formatted = now.format(fmt); // now 포맷팅

		        // 파싱 : 문자열 -> 객체, 재파싱 : 포맷팅한 문자열 -> 객체
		        // now 포맷팅한 거 다시 객체로(LocalDateTime)
		        LocalDateTime parsed = LocalDateTime.parse(formatted, fmt);
		        
		        // 컴퓨터에 설정된 기본 타임존 읽어오기(ex.Asia/Seoul)    
		        ZoneId zone = ZoneId.systemDefault();// zone -> 타임존 담겨있음.(위치)
		        ZonedDateTime zdt = parsed.atZone(zone); // zdt -> 파싱한 parsed에 타임존 부여
		        
		        // (ZonedDateTime) -> instant : (타임존에 맞춘) 전 세계 공통시간
		        Instant instant = zdt.toInstant();
		        Date date = Date.from(instant); // 레거시 : 옛날 방식(옛날 코드와의 호환성을 위해 사용) -> Date
		        
		        // Calendar -> 레거시에서 연/월/일/시가 따로따로 필요할때 사용
		        // date에는 타임존X -> TimeZone.getTimeZone 이걸로 cal에 타임존 부여
		        // setTime() -> 바꾸는것/맞추는것
		        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(zone));
		        cal.setTime(date); // cal은 date의 절대 시각 따르기
		        
		        // instant. : 전 세계 공통시간, atZone : 타임존 부여, format : 포맷팅
		        String recentRoute = instant.atZone(zone).format(fmt); // 최신 경로

		        // 레거시 경로(옛날)
		        // SimpleDateFormat : 과거 포맷팅 방법
		        // setTimeZone : 과거 타임존 부여 방법
		        // getTime() -> 가져오는 것
		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		        sdf.setTimeZone(TimeZone.getTimeZone(zone));
		        String pastRouteFromDate = sdf.format(date); // sdf의 모양으로 date
		        String pastRouteFromCal  = sdf.format(cal.getTime()); // sdf의 모양으로 cal 가져오기
		        
		        System.out.println("기본 컴퓨터 시간: " + now);
		        System.out.println("`yyyy-MM-dd HH:mm`모양으로 포맷팅: " + formatted);
		        System.out.println("재파싱: " + parsed);
		        System.out.println("타임존: " + zone);
		        System.out.println("타임존 부여: " + zdt);
		        System.out.println("(타임존에 맞춘) 전세계 공통시간: " + instant);
		        System.out.println("레거시: " + date);
		        System.out.println("최신 경로(instant,atZone,format): " + recentRoute);
		        System.out.println("레거시 경로(Date 기반): " + pastRouteFromDate);
		        System.out.println("레거시 경로(Calendar 기반): " + pastRouteFromCal);  
	}

}