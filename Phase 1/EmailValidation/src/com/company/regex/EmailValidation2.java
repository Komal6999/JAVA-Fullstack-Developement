package com.company.regex;


 //Java program to check an email address
// is valid using Regex.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class Test
{
public static boolean isValid(String email)
{
String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
"[a-zA-Z0-9_+&*-]+)*@" +
"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
"A-Z]{2,7}$";

Pattern pat = Pattern.compile(emailRegex);
if (email == null)
return false;
return pat.matcher(email).matches();
}
}