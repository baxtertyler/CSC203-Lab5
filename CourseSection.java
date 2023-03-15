package equality;

import java.time.LocalTime;
import java.util.Objects;

class CourseSection
{
   private final String prefix;
   private final String number;
   private final int enrollment;
   private final LocalTime startTime;
   private final LocalTime endTime;

   public CourseSection(final String prefix, final String number,
      final int enrollment, final LocalTime startTime, final LocalTime endTime)
   {
      this.prefix = prefix;
      this.number = number;
      this.enrollment = enrollment;
      this.startTime = startTime;
      this.endTime = endTime;
   }

   // additional likely methods not defined since they are not needed for testing
   public boolean equals(Object o)
   {
      if (o == null) return false;
      if (o instanceof CourseSection)
      {
         CourseSection c = (CourseSection) o;
         if (    this.prefix.equals(c.prefix) &&
                 this.number.equals(c.number) &&
                 this.enrollment == c.enrollment &&
                 this.startTime.equals(c.startTime) &&
                 this.endTime.equals(c.endTime))
         {
            return true;
         }
      }
      return false;
   }


   public int hashCode()
   {
      int a = 0; int b = 0; int c = 0; int d = 0; int e = 0;
      if (this.prefix != null)
      {
         for(int i = 0; i < this.prefix.length(); i++)
         {
            a += this.prefix.charAt(i);
         }
         a *= 31;
      }
      if (this.number != null)
      {
         for(int i = 0; i < this.number.length(); i++)
         {
            b += this.number.charAt(i);
         }
         b *= 31;
      }
      if (this.enrollment != 0)
      {
         c += 31 * this.enrollment;
      }
      if (this.startTime != null)
      {
         d += 31 * this.startTime.getHour();
         d += 31 * this.startTime.getMinute();
         d += 31 * this.startTime.getSecond();
         d += 31 * this.startTime.getNano();
      }
      if (this.endTime != null)
      {
         e += 31 * this.endTime.getHour();
         e += 31 * this.endTime.getMinute();
         e += 31 * this.endTime.getSecond();
         e += 31 * this.endTime.getNano();
      }

      return (a + b + c + d + e);

      /*return this.prefix.hashCode() + this.number.hashCode() + this.enrollment +
              this.startTime.hashCode() + this.endTime.hashCode();*/
   }
}
