import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class WordleList
{
    private ArrayList<String> wordList;
    public WordleList()
    {
        wordList = new ArrayList<String>(Arrays.asList("Abuse","Adult","Agent","Anger",
                "Apple","Award","Basis","Beach","Birth","Blood","Board","Brain","Bread","Break","Brown","Buyer",
                "Cause","Chair","Chest","Chief","Child","China","Claim","Class","Coach","Coast","Court","Cover",
                "Cream","Crime","Cross","Crowd","Crown","Cycle","Dance","Death","Depth","Doubt","Draft","Drama",
                "Dream","Dress","Drink","Drive","Earth","Enemy","Entry","Error","Event","Faith","Fault","Field",
                "Fight","Final","Floor","Focus","Force","Frame","Frank","Front","Fruit","Glass","Grant","Grass",
                "Green","Group","Guide","Heart","Henry","Horse","Hotel","House","Index","Input","Issue","Japan",
                "Jones","Judge","Knife","Laura","Layer","Level","Lunch","Major","March","Match","Motor","Mouth",
                "Music","Night","Noise","North","Nurse","Offer","Order","Other","Owner","Panel","Paper","Party",
                "Peace","Peter","Phase","Phone","Piece","Pilot","Pitch","Place","Plane","Plant","Plate","Point",
                "Pound","Power","Press","Price","Pride","Prize","Proof","Queen","Radio","Range","Ratio","Reply",
                "Right","River","Round","Route","Rugby","Scale","Scene","Scope","Score","Sense","Shape","Share",
                "Sheep","Sheet","Shift","Shirt","Shock","Sight","Simon","Skill","Sleep","Smile","Smith","Smoke",
                "Sound","South","Space","Speed","Spite","Sport","Squad","Staff","Stage","Start","State","Steam",
                "Steel","Stock","Stone","Store","Study","Stuff","Style","Sugar","Table","Taste","Terry","Theme",
                "Thing","Title","Total","Touch","Tower","Track","Trade","Train","Trend","Trial","Trust","Truth",
                "Uncle","Union","Unity","Value","Video","Visit","Water","While","White","Whole","World","There",
                "Where","Which","Whose","Whoso","Yours","Yours","Admit","Adopt","Agree","Allow","Alter","Apply",
                "Argue","Blame","Break","Bring","Build","Burst","Carry","Catch","Cause","Check","Clean",
                "Clear","Climb","Close","Count","Cover","Cross","Dance","Doubt","Drink","Drive","Enjoy","Enter",
                "Exist","Learn","Leave","Limit","Marry","Match","Occur","Offer","Order","Phone","Place","Point",
                "Press","Prove","Raise","Reach","Refer","Relax","Serve","Shall","Share","Shift","Shoot","Sleep",
                "Solve","Sound","Speak","Spend","Split","Stand","Start","State","Stick","Study","Teach","Thank",
                "Think","Throw","Touch","Train","Treat","Waste","Watch","Worry","Would","Write","Above","Acute",
                "Alive","Alone","Angry","Aware","Awful","Basic","Black","Blind","Brave","Brief","Broad","Brown",
                "Cheap","Chief","Civil","Clean","Clear","Close","Crazy","Daily","Dirty","Early","Empty","Equal"));

    }

    public String getWord()
    {
        int random = (int) (Math.random() * wordList.size());
        return wordList.get(random);
    }

}

