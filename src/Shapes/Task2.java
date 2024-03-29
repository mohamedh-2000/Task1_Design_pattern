package Shapes;

public class Task2 {

//    שאלות תיאורטיות:
//            1.בהנחה שיש מספר גדול של ציורים של פיקאסו, והמשותףלכולם הוא שעלות כל אחד מהם
//    היא מיליון דולר, אורך ורוחב הציורים של פיקאסו הוא קבוע והינו120ס"מ, הציעו פתרון
//    המאפשר ליצור בקלות יתרה אובייקטים מטיפוסDrawingהמייצגים ציורים של פיקאסו,
//    מבלי לחזור על הקוד הכרוך באתחול, בכל פעם שרוצים ליצור ציור חדש.
//2.האם אחת המחלקות בתרגיל זה תתאים להיותSigleton? הסבירו.

//2-
//    בהתאם למה שהוצג בתרגיל, אין צורך בכך שהמחלקות SquareFactory, RectangleFactory, ו־TriangleFactory יהיו Singleton. הן משמשות ליצירת אובייקטים חדשים כל פעם שצריך, ולכן אין כל סיבה להגביל אותן לאובייקט יחיד. כל יצירה של צורה חדשה נעשית על ידי יצירת אובייקט חדש מסוג המחלקה המתאימה.
//
//    לעומת זאת, כאשר מדובר בכתיבת מחלקה כמו DrawingBuilder או Prototype, אשר עשויות לשמש פעם אחת או בקצת מקרים ואין צורך ליצור מספר רב של המחלקות הללו, אז ייתכן שהן תהיינה Singleton. אם אתה רואה שצריך לשמש את המחלקה פעם אחת בלבד ואין צורך במספר רב של הפעולות שבה, אז השימוש ב-Singleton יכול להיות הגיוני.
//
}