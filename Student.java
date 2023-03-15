package equality;

import java.util.List;
import java.util.Objects;

class Student
{
   private final String surname;
   private final String givenName;
   private final int age;
   private final List<CourseSection> currentCourses;

   public Student(final String surname, final String givenName, final int age,
      final List<CourseSection> currentCourses)
   {
      this.surname = surname;
      this.givenName = givenName;
      this.age = age;
      this.currentCourses = currentCourses;
   }

   public boolean equals(Object o)
   {
      if (o == null) return false;
      if (o instanceof Student)
      {
         Student s = (Student) o;
         if (    this.surname.equals(s.surname) &&
                 this.givenName.equals(s.givenName) &&
                 this.age == s.age &&
                 this.currentCourses.equals(s.currentCourses))
         {
            return true;
         }
      }
      return false;
   }

   public int hashCode()
   {
      return Objects.hash(this.surname, this.givenName, this.age, this.currentCourses);
   }
}
