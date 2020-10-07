public class StatsService {


    public int salesAmount (int[] data){
        int salesSumm = 0;
        for (int datum : data) {
            salesSumm += datum;
        }
        return salesSumm;
    }

    public int avrSalesPerMonth (int[] data){
        int salesSumm = 0;
        for (int datum : data) {
            salesSumm += datum;
        }
        return salesSumm/data.length;
    }



}
