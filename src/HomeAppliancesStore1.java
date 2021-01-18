     /**
     * MAIN CLASS
     */
    public class HomeAppliancesStore1 {
        /**
         * BASIC CLASS
         * @param args DEN KANOUME XRHSH ARGS
         */
        public static void main(String[] args) {

            Fridge Fridge = new Fridge("TEST" , "HTM2" , "Fridge" , "White" , 500 , 500 , 500 , 250 , 250 , 100 , 50 , 3);
            WashineMachine Machine = new WashineMachine("TEST" , "HDMI" , "WashineMashine" , "White" , 500 , 500 , 200 , 250 , 50 , 90 , 30 ,35);
            Oven Oven = new Oven("TEST" , "GDMI" , "Oven" , "Black" , 500 , 500 , 500 , 200 , 150 , 20 , 30 , 4);
            AirCondition Air = new AirCondition("TEST" , "HDMI" , "AirCondition" , "Orange" , 500 , 250 , 300 , 500 , 200 , 30 , 40 , 20);
            WashineMachine Machine2 = new WashineMachine("TEST" , "HDMI" , "WashineMashine" , "White" , 500 , 500 , 200 , 250 , 50 , 90 , 30 ,35);
            Oven Oven2 = new Oven("TEST" , "GDMI" , "Oven" , "Black" , 500 , 500 , 500 , 200 , 150 , 20 , 30 , 4);

            System.out.println(Fridge.FridgeCounter());
            System.out.println(Machine.MachineCounter());
            System.out.println(Oven.OvenCounter());
            System.out.println(Air.AirCounter());
        }

    }

     /**
      * FTIAXNOUME ENA PSIGIO.
      */
     public class Fridge {

         private int Mikos;
         private int ipsos;
         private int vathos;
         private String OnomaKataskeuasth;
         private String OnomaSuskeuhs;
         private String TuposSuskeuhs;
         private int Katanalwsh;
         private String Xrwma;
         private int Timh;
         private int Xwros; // lt
         private int maxthermokrasia;
         private int Portes;

         // Setters
         /**
          * Thetoume thn timh
          * @param Mikos H metablith pou thetoume
          */
         public void SetMikos(int Mikos){
             this.Mikos = Mikos;
         }
         /**
          * Thetoume thn timh
          * @param ipsos  H metablith pou thetoume
          */
         public void SetIpsos(int ipsos){
             this.ipsos = ipsos;
         }
         /**
          * Thetoume thn timh
          * @param vathos H metablith pou thetoume
          */
         public void SetVathos(int vathos){
             this.vathos = vathos;
         }
         /**
          * Thetoume thn timh
          * @param OnomaKataskeuasth H metablith pou thetoume
          */
         public void SetOnomaKataskeuasth(String OnomaKataskeuasth){
             this.OnomaKataskeuasth = OnomaKataskeuasth;
         }
         /**
          * Thetoume thn timh
          * @param OnomaSuskeuhs H metablith pou thetoume
          */
         public void SetOnomaSuskeuhs(String OnomaSuskeuhs){
             this.OnomaSuskeuhs = OnomaSuskeuhs;
         }
         /**
          * Thetoume thn timh
          * @param TuposSuskeuhs H metablith pou thetoume
          */
         public void SetTuposSuskeuhs(String TuposSuskeuhs){
             this.TuposSuskeuhs = TuposSuskeuhs;
         }
         /**
          * Thetoume thn timh
          * @param Katanalwsh H metablith pou thetoume
          */
         public void SetKatanalwsh(int Katanalwsh){
             this.Katanalwsh = Katanalwsh;
         }
         /**
          * Thetoume thn timh
          * @param Xrwma H metablith pou thetoume
          */
         public void SetXrwma(String Xrwma){
             this.Xrwma = Xrwma;
         }
         /**
          * Thetoume thn timh
          * @param Timh H metablith pou thetoume
          */
         public void SetTimh(int Timh){
             this.Timh = Timh;
         }
         /**
          * Thetoume thn timh
          * @param Xwros H metablith pou thetoume
          */
         public void SetXwros(int Xwros){
             this.Xwros = Xwros;
         }
         /**
          * Thetoume thn timh
          * @param maxthermokrasia H metablith pou thetoume
          */
         public void SetMaxthermokrasia(int maxthermokrasia){
             this.maxthermokrasia = maxthermokrasia;
         }
         /**
          * Thetoume thn timh
          * @param Portes H metablith pou thetoume
          */
         public void SetPortes (int Portes){
             this.Portes = Portes;
         }

         // Getters
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetMikos(){
             return Mikos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetIpsos(){
             return ipsos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetVathos(){
             return vathos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetOnomaKataskeuasth(){
             return OnomaKataskeuasth;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetOnomaSuskeuhs(){return OnomaSuskeuhs;}
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetTuposSuskeush(){
             return TuposSuskeuhs;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetKatanalwsh(){
             return Katanalwsh;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetXrwma(){
             return Xrwma;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int Gettimh(){
             return Timh;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetXwros(){
             return Xwros;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetMaxthermokrasia(){
             return maxthermokrasia;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetPortes (){
             return Portes;
         }

         static int FridgeCounter = 0;

         /**
          * Epistefei to athroisma twn suskeuwn mas
          * @return FridgeCounter
          */
         public int FridgeCounter(){
             System.out.printf("Fridges: ");
             return FridgeCounter;
         }

         Fridge(String OnomaKataskeuasth , String OnomaSuskeuhs , String TuposSuskeuhs , String Xrwma , int Mikos , int Ipsos , int Vathos , int Katanalwsh , int timh , int Xwros , int maxthermokrasia , int Portes){
             try{
                 SetMikos(Mikos);
                 SetIpsos(Ipsos);
                 SetVathos(Vathos);
                 SetKatanalwsh(Katanalwsh);
                 SetTimh(timh);
                 SetXwros(Xwros);
                 SetMaxthermokrasia(maxthermokrasia);
                 SetPortes (Portes);
                 SetOnomaKataskeuasth(OnomaKataskeuasth);
                 SetOnomaSuskeuhs(OnomaSuskeuhs);
                 SetTuposSuskeuhs(TuposSuskeuhs);
                 SetXrwma(Xrwma);
             }
             catch (Exception e){
                 System.out.println("ERROR: Cant Set Values");
             }
             FridgeCounter = FridgeCounter + 1;
             Display();
         }

         /**
          * Emfanish stoixeiwn
          */
         public void Display(){
             System.out.printf("Kataskeuasths: %s\n" , GetOnomaKataskeuasth());
             System.out.printf("%s: %s %dcm %dcm %dcm Katanalwsh: %dkW/h\n" , GetTuposSuskeush() , GetOnomaSuskeuhs() , GetMikos() , GetIpsos() , GetVathos() , GetKatanalwsh());
             System.out.printf("Price: %d Xwritikothta: %dlt MaxThermokrasia: %d'C Portes: %d Xrwma: %s\n\n" , Gettimh() , GetXwros() , GetMaxthermokrasia() , GetXrwma());
         }

         private void periodicMantainance(){

         }

     }

     /**
      * Ftiaxnoume ema plunturio
      */
     public class WashineMachine {

         private int Mikos;
         private int ipsos;
         private int vathos;
         private String OnomaKataskeuasth;
         private String OnomaSuskeuhs;
         private String TuposSuskeuhs;
         private int Katanalwsh;
         private String Xrwma;
         private int Timh;
         private int Xwros; // kilos
         private int Programmata;
         private int thorivos;

         // Setters
         /**
          * Thetoume thn timh
          * @param Mikos H metablith pou thetoume
          */
         public void SetMikos(int Mikos){
             this.Mikos = Mikos;
         }
         /**
          * Thetoume thn timh
          * @param ipsos H metablith pou thetoume
          */
         public void SetIpsos(int ipsos){
             this.ipsos = ipsos;
         }
         /**
          * Thetoume thn timh
          * @param vathos H metablith pou thetoume
          */
         public void SetVathos(int vathos){
             this.vathos = vathos;
         }
         /**
          * Thetoume thn timh
          * @param OnomaKataskeuasth H metablith pou thetoume
          */
         public void SetOnomaKataskeuasth(String OnomaKataskeuasth){
             this.OnomaKataskeuasth = OnomaKataskeuasth;
         }
         /**
          * Thetoume thn timh
          * @param OnomaSuskeuhs H metablith pou thetoume
          */
         public void SetOnomaSuskeuhs(String OnomaSuskeuhs){
             this.OnomaSuskeuhs = OnomaSuskeuhs;
         }
         /**
          * Thetoume thn timh
          * @param TuposSuskeuhs H metablith pou thetoume
          */
         public void SetTuposSuskeuhs(String TuposSuskeuhs){
             this.TuposSuskeuhs = TuposSuskeuhs;
         }
         /**
          * Thetoume thn timh
          * @param Katanalwsh H metablith pou thetoume
          */
         public void SetKatanalwsh(int Katanalwsh){
             this.Katanalwsh = Katanalwsh;
         }
         /**
          * Thetoume thn timh
          * @param Xrwma H metablith pou thetoume
          */
         public void SetXrwma(String Xrwma){
             this.Xrwma = Xrwma;
         }
         /**
          * Thetoume thn timh
          * @param Timh H metablith pou thetoume
          */
         public void SetTimh(int Timh){
             this.Timh = Timh;
         }
         /**
          * Thetoume thn timh
          * @param Xwros H metablith pou thetoume
          */
         public void SetXwros(int Xwros){
             this.Xwros = Xwros;
         }
         /**
          * Thetoume thn timh
          * @param Programmata H metablith pou thetoume
          */
         public void SetProgrammata (int Programmata){
             this.Programmata = Programmata;
         }
         /**
          * Thetoume thn timh
          * @param thorivos H metablith pou thetoume
          */
         public void SetThorivos(int thorivos){
             this.thorivos = thorivos;
         }

         // Getters
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetMikos(){
             return Mikos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetIpsos(){
             return ipsos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetVathos(){
             return vathos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetOnomaKataskeuasth(){
             return OnomaKataskeuasth;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetOnomaSuskeuhs(){return OnomaSuskeuhs;}
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetTuposSuskeush(){
             return TuposSuskeuhs;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetKatanalwsh(){
             return Katanalwsh;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetXrwma(){
             return Xrwma;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int Gettimh(){
             return Timh;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.v
          */
         public int GetXwros(){
             return Xwros;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetProgrammata (){
             return Programmata;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetThorivos(){
             return thorivos;
         }

         static int MachineCounter = 0;

         /**
          *  Epistefei to athroisma twn suskeuwn mas
          * @return MachineCounter
          */
         public int MachineCounter() {
             System.out.printf("WashineMashines: ");
             return MachineCounter;
         }
         WashineMachine(String OnomaKataskeuasth , String OnomaSuskeuhs , String TuposSuskeuhs , String Xrwma , int Mikos , int Ipsos , int Vathos , int Katanalwsh , int timh , int Xwros , int Programmata, int thorivos){
             try{
                 SetMikos(Mikos);
                 SetIpsos(Ipsos);
                 SetVathos(Vathos);
                 SetKatanalwsh(Katanalwsh);
                 SetTimh(timh);
                 SetXwros(Xwros);
                 SetOnomaKataskeuasth(OnomaKataskeuasth);
                 SetOnomaSuskeuhs(OnomaSuskeuhs);
                 SetTuposSuskeuhs(TuposSuskeuhs);
                 SetXrwma(Xrwma);
                 SetProgrammata(Programmata);
                 SetThorivos(thorivos);
             }
             catch (Exception e){
                 System.out.println("ERROR: Cant Set Values");
             }
             MachineCounter = MachineCounter + 1;
             Display();
         }

         /**
          *  Emfanish stoixeiwn
          */
         public void Display(){
             System.out.printf("Kataskeuasths: %s\n" , GetOnomaKataskeuasth());
             System.out.printf("%s: %s %dcm %dcm %dcm Katanalwsh: %dkW/h\n" , GetTuposSuskeush() , GetOnomaSuskeuhs() , GetMikos() , GetIpsos() , GetVathos() , GetKatanalwsh());
             System.out.printf("Price: %d Xwritikothta: %dKilos MaxStrofes: %d Thorivos: %ddb Xrwma: %s\n\n" , Gettimh() , GetXwros() , GetProgrammata () , GetThorivos() , GetXrwma());
         }

         private void periodicMantainance(){
         }

     }


     /**
      * Ftiaxnoume enan fourno
      */
     public class Oven {

         private int Mikos;
         private int ipsos;
         private int vathos;
         private String OnomaKataskeuasth;
         private String OnomaSuskeuhs;
         private String TuposSuskeuhs;
         private int Katanalwsh;
         private String Xrwma;
         private int Timh;
         private int Xwros; // lt
         private int thermokrasia; // Celcius
         private int matia;

         // Setters
         /**
          * Thetoume thn timh
          * @param Mikos H metablith pou thetoume
          */
         public void SetMikos(int Mikos){
             this.Mikos = Mikos;
         }
         /**
          * Thetoume thn timh
          * @param ipsos H metablith pou thetoume
          */
         public void SetIpsos(int ipsos){
             this.ipsos = ipsos;
         }
         /**
          * Thetoume thn timh
          * @param vathos H metablith pou thetoume
          */
         public void SetVathos(int vathos){
             this.vathos = vathos;
         }
         /**
          * Thetoume thn timh
          * @param OnomaKataskeuasth H metablith pou thetoume
          */
         public void SetOnomaKataskeuasth(String OnomaKataskeuasth){
             this.OnomaKataskeuasth = OnomaKataskeuasth;
         }
         /**
          * Thetoume thn timh
          * @param OnomaSuskeuhs H metablith pou thetoume
          */
         public void SetOnomaSuskeuhs(String OnomaSuskeuhs){
             this.OnomaSuskeuhs = OnomaSuskeuhs;
         }
         /**
          * Thetoume thn timh
          * @param TuposSuskeuhs H metablith pou thetoume
          */
         public void SetTuposSuskeuhs(String TuposSuskeuhs){
             this.TuposSuskeuhs = TuposSuskeuhs;
         }
         /**
          * Thetoume thn timh
          * @param Katanalwsh H metablith pou thetoume
          */
         public void SetKatanalwsh(int Katanalwsh){
             this.Katanalwsh = Katanalwsh;
         }
         /**
          * Thetoume thn timh
          * @param Xrwma H metablith pou thetoume
          */
         public void SetXrwma(String Xrwma){
             this.Xrwma = Xrwma;
         }
         /**
          * Thetoume thn timh
          * @param Timh H metablith pou thetoume
          */
         public void SetTimh(int Timh){
             this.Timh = Timh;
         }
         /**
          * Thetoume thn timh
          * @param Xwros H metablith pou thetoume
          */
         public void SetXwros(int Xwros){
             this.Xwros = Xwros;
         }
         /**
          * Thetoume thn timh
          * @param thermokrasia H metablith pou thetoume
          */
         public void Setthermokrasia(int thermokrasia){
             this.thermokrasia = thermokrasia;
         }
         /**
          * Thetoume thn timh
          * @param matia H metablith pou thetoume
          */
         public void Setmatia(int matia){
             this.matia = matia;
         }

         // Getters
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetMikos(){
             return Mikos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetIpsos(){
             return ipsos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetVathos(){
             return vathos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetOnomaKataskeuasth(){
             return OnomaKataskeuasth;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetOnomaSuskeuhs(){return OnomaSuskeuhs;}
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetTuposSuskeush(){
             return TuposSuskeuhs;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetKatanalwsh(){
             return Katanalwsh;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetXrwma(){
             return Xrwma;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int Gettimh(){
             return Timh;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetXwros(){
             return Xwros;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetThermokrasia(){
             return  thermokrasia;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetMatia(){
             return matia;
         }

         static int OvenCounter = 0;

         /**
          *  Epistefei to athroisma twn suskeuwn mas
          * @return OvenCounter
          */
         public int OvenCounter(){
             System.out.printf("Ovens: ");
             return OvenCounter;
         }
         Oven(String OnomaKataskeuasth , String OnomaSuskeuhs , String TuposSuskeuhs , String Xrwma , int Mikos , int Ipsos , int Vathos , int Katanalwsh , int timh , int Xwros , int thermokrasia , int matia){
             try{
                 SetMikos(Mikos);
                 SetIpsos(Ipsos);
                 SetVathos(Vathos);
                 SetKatanalwsh(Katanalwsh);
                 SetTimh(timh);
                 SetXwros(Xwros);
                 SetOnomaKataskeuasth(OnomaKataskeuasth);
                 SetOnomaSuskeuhs(OnomaSuskeuhs);
                 SetTuposSuskeuhs(TuposSuskeuhs);
                 SetXrwma(Xrwma);
                 Setthermokrasia(thermokrasia);
                 Setmatia(matia);
             }
             catch (Exception e){
                 System.out.println("ERROR: Cant Set Values");
             }
             OvenCounter = OvenCounter + 1;
             Display();
         }

         /**
          *  Emfanish stoixeiwn
          */
         public void Display(){
             System.out.printf("Kataskeuasths: %s\n" , GetOnomaKataskeuasth());
             System.out.printf("%s: %s %dcm %dcm %dcm Katanalwsh: %dkW/h\n" , GetTuposSuskeush() , GetOnomaSuskeuhs() , GetMikos() , GetIpsos() , GetVathos() , GetKatanalwsh());
             System.out.printf("Price: %d Xwritikothta: %dlt Thermokrasia: %d'C Matia: %d Xrwma: %s\n\n" , Gettimh() , GetXwros() , GetThermokrasia() , GetMatia() , GetXrwma());
         }

         private void periodicMantainance(){
         }

     }



     /**
      * Ftiaxnoyme ena AirCondition
      */
     public class AirCondition {

         private int Mikos;
         private int ipsos;
         private int vathos;
         private String OnomaKataskeuasth;
         private String OnomaSuskeuhs;
         private String TuposSuskeuhs;
         private int Katanalwsh;
         private String Xrwma;
         private int Timh;

         private int thorivoseswterikismonadas;
         private int thermokrasiakruou;
         private int thermokrasiazestou;

         // Setters

         /**
          * Thetoume thn timh
          * @param Mikos H metablith pou thetoume
          */
         public void SetMikos(int Mikos){
             this.Mikos = Mikos;
         }
         /**
          * Thetoume thn timh
          * @param ipsos H metablith pou thetoume
          */
         public void SetIpsos(int ipsos){
             this.ipsos = ipsos;
         }
         /**
          * Thetoume thn timh
          * @param vathos H metablith pou thetoume
          */
         public void SetVathos(int vathos){
             this.vathos = vathos;
         }
         /**
          * Thetoume thn timh
          * @param OnomaKataskeuasth H metablith pou thetoume
          */
         public void SetOnomaKataskeuasth(String OnomaKataskeuasth){
             this.OnomaKataskeuasth = OnomaKataskeuasth;
         }
         /**
          * Thetoume thn timh
          * @param OnomaSuskeuhs H metablith pou thetoume
          */
         public void SetOnomaSuskeuhs(String OnomaSuskeuhs){
             this.OnomaSuskeuhs = OnomaSuskeuhs;
         }
         /**
          * Thetoume thn timh
          * @param TuposSuskeuhs H metablith pou thetoume
          */
         public void SetTuposSuskeuhs(String TuposSuskeuhs){
             this.TuposSuskeuhs = TuposSuskeuhs;
         }
         /**
          * Thetoume thn timh
          * @param Katanalwsh H metablith pou thetoume
          */
         public void SetKatanalwsh(int Katanalwsh){
             this.Katanalwsh = Katanalwsh;
         }
         /**
          * Thetoume thn timh
          * @param Xrwma H metablith pou thetoume
          */
         public void SetXrwma(String Xrwma){
             this.Xrwma = Xrwma;
         }
         /**
          * Thetoume thn timh
          * @param Timh H metablith pou thetoume
          */
         public void SetTimh(int Timh){
             this.Timh = Timh;
         }
         /**
          * Thetoume thn timh
          * @param thorivoseswterikismonadas H metablith pou thetoume
          */
         public void Setthorivoseswterikismonadas (int thorivoseswterikismonadas){
             this. thorivoseswterikismonadas = thorivoseswterikismonadas;
         }
         /**
          * Thetoume thn timh
          * @param thermokrasiakruou H metablith pou thetoume
          */
         public void Setthermokrasiakruou(int thermokrasiakruou){
             this.thermokrasiakruou = thermokrasiakruou;
         }
         /**
          * Thetoume thn timh
          * @param thermokrasiazestou H metablith pou thetoume
          */
         public void Setthermokrasiazestou(int thermokrasiazestou){
             this.thermokrasiazestou = thermokrasiazestou;
         }

         // Getters
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetMikos(){
             return Mikos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetIpsos(){
             return ipsos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetVathos(){
             return vathos;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetOnomaKataskeuasth(){
             return OnomaKataskeuasth;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetOnomaSuskeuhs(){return OnomaSuskeuhs;}
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetTuposSuskeush(){
             return TuposSuskeuhs;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int GetKatanalwsh(){
             return Katanalwsh;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public String GetXrwma(){
             return Xrwma;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int Gettimh(){
             return Timh;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int Getthorivoseswterikismonadas(){
             return thorivoseswterikismonadas;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int Getthermokrasiaktuou(){
             return thermokrasiakruou;
         }
         /**
          * Epistrefei thn timh ths metabliths mas.
          * @return Epistrefei thn timh ths metabliths mas.
          */
         public int Getthermokrasiazestou(){
             return thermokrasiazestou;
         }

         static int AirCounter = 0;

         /**
          *  Epistefei to athroisma twn suskeuwn mas
          * @return AirCounter
          */
         public int AirCounter(){
             System.out.printf("AirConditions: ");
             return AirCounter;
         }
         AirCondition(String OnomaKataskeuasth , String OnomaSuskeuhs , String TuposSuskeuhs , String Xrwma , int Mikos , int Ipsos , int Vathos , int Katanalwsh , int timh , int thorivoseswterikismonadas, int thermokrasiakruou , int thermokrasiazestou){
             try{
                 SetMikos(Mikos);
                 SetIpsos(Ipsos);
                 SetVathos(Vathos);
                 SetKatanalwsh(Katanalwsh);
                 SetTimh(timh);
                 SetOnomaKataskeuasth(OnomaKataskeuasth);
                 SetOnomaSuskeuhs(OnomaSuskeuhs);
                 SetTuposSuskeuhs(TuposSuskeuhs);
                 SetXrwma(Xrwma);
                 Setthorivoseswterikismonadas(thorivoseswterikismonadas);
                 Setthermokrasiakruou(thermokrasiakruou);
                 Setthermokrasiazestou(thermokrasiazestou);
             }
             catch (Exception e){
                 System.out.println("ERROR: Cant Set Values");
             }
             AirCounter = AirCounter + 1;
             Display();
         }

         /**
          * Emfanish Stoixeiwn
          */
         public void Display(){
             System.out.printf("Kataskeuasths: %s\n" , GetOnomaKataskeuasth());
             System.out.printf("%s: %s %dcm %dcm %dcm Katanalwsh: %dkW/h\n" , GetTuposSuskeush() , GetOnomaSuskeuhs() , GetMikos() , GetIpsos() , GetVathos() , GetKatanalwsh());
             System.out.printf("Price: %d Xrwma: %s Thorivos: %ddb ThermokrasiaKruou: %d ThermokrasiaZestou: %d\n\n" , Gettimh() ,  GetXrwma() , Getthorivoseswterikismonadas () , Getthermokrasiaktuou() , Getthermokrasiazestou());
         }
         private void periodicMantainance(){
         }

     }
