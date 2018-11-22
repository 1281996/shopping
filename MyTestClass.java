package com.mallika.test;
import com.mallika.date.*;
public class MyTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		
		DatDifferenceProvider provider = new DatDifferenceProvider();
		TestClassrecords[] myTestRecords = new TestClassrecords[15];
		myTestRecords[0] = new TestClassrecords(new MyDate(20, 11, 2018), new MyDate(20, 11, 2018), 0);
		myTestRecords[1] = new TestClassrecords(new MyDate(20, 11, 2018), new MyDate(27, 11, 2018), 7);
		myTestRecords[2] = new TestClassrecords(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42);
		myTestRecords[3] = new TestClassrecords(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);
		myTestRecords[4] = new TestClassrecords(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256);
		myTestRecords[5] = new TestClassrecords(new MyDate(06, 04, 2013), new MyDate(18, 12, 2014), 621);
		myTestRecords[6] = new TestClassrecords(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013), 987);
		myTestRecords[7] = new TestClassrecords(new MyDate(06, 01, 2011), new MyDate(06, 3, 2011), 59);
		myTestRecords[8] = new TestClassrecords(new MyDate(06, 01, 2012), new MyDate(06, 3, 2012), 60);
		myTestRecords[9] = new TestClassrecords(new MyDate(06, 02, 2012), new MyDate(06, 3, 2012), 29);
		myTestRecords[10] = new TestClassrecords(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012), 298);
		myTestRecords[11] = new TestClassrecords(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012), 304);
		myTestRecords[12] = new TestClassrecords(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113), 37511);
		myTestRecords[13] = new TestClassrecords(new MyDate(06, 04,2011 ), new MyDate(18, 12, 2413), 147084);
		myTestRecords[14] = new TestClassrecords(new MyDate(06, 04,2011 ), new MyDate(18, 12, 2813), 293181);
		/*
		 * for (MyTestRecord testRecord : myTestRecords) { int calculatedDiff =
		 * DateDifferenceProvider.getDateDifference(testRecord.getStartDate(),
		 * testRecord.getEndDate()); if (calculatedDiff ==
		 * testRecord.getActualDiffernce()) { System.out.println("Test Case passed"); }
		 * else { System.err.println("Test Case failed"); } }
		 */

		for (int index=0; index < myTestRecords.length; index++) {
			int calculatedDiff = provider.calDateDiff(myTestRecords[index].getStartDate(),
					myTestRecords[index].getEndDate());
			if (calculatedDiff == myTestRecords[index].getActualDiffernce()) {
				System.out.println("Test Case passed");
			} else {
				System.err.println("Test Case failed"+" Actual =" + myTestRecords[index].getActualDiffernce()+ " calculated ="+ calculatedDiff);
			}
		}
       }
	}


