/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 *
 */
package finished.others.finished.No459_重复的子字符串;

/**
 * @author Henry Xiao
 * @date 2019年6月24日
 */
public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = "prdttmqtookjbrryiwbouvkhgbrommxyhyscpnphvjllkwawtbwftgzczcrmviwpaacbsfuqpiqiyjwbeesmsbqmorjstvrgvmdizflhkkeumcptccryrkxzzxvygkemhbyfmhpexfoidjqvwfccqitxrppkrxlxrrvkvogcmgzqaivhbbgjtgfgpgspmlhfcgelhovcnamaizcaysvrpsnverowehpiztmedkixsxwzzseaozyzjvpvxetprasbndetckeemhqhfyqcdecgdtraxznlcdlwyxutryycmcxsyyscnutifyjecsudmhbfgpvymiovjwcmgsgzcebovlztfpknmtqlkxychrwxqfaumevtdkgbuqebyrnudvcfjydxqihvauauymxgdfjlemmpozgdzvsatcvemrojmxhvfmfbtdjywwephrzbutnuommunmnhmnqgfxxjwvregecxmqxmrukeynsgfsvkojfchcjuqmyypbndycjknlmxdjafhstcyszbujfxcduojzmynweqshnskjvbcdjhhhwckkrtebyzoqapwbebancwhmqwobvyxcfglwuwvyjfwwumcvovcghypywyiqbwjdgmedyhfppmmyafvwyavtdtuyzbmfxfeljberxdtlpavaxgectauqycnfgkhdcvhteiggngynbnqvpqtoxpktehmddebvbpeigccpnrraomgllylvkalezuprztzdlotldnjtgjywtawkykdjucbfmuwyvrqftrmbyjhfkndsehrlybncisumoczkxaadaleqwvjpqauhqgibmbxcivjdroaghxvwybphqkelwdoidxnygjtguhfqlthemedjmnhoclssfkrkzwalgapnbemkujrshojxqddkbqwfqkismfrxofgqibpqnngroephngywjakiozcceypzzaqcwqogbucjwaybvbmhgljjndcwcrxttkqdfcvacvrnjgwtexmeytarnltfiqqjrtxyfipyrshacohcdkovnktrdhopzdfyripyabgasnzxgpsxcrdhuiwaedcmuoigadrsmeowolpzsvywxihgebyqvuebmxcuoofumbxlntxzlhdexixaafuqrtrwompetjgaqwdlchxsxdtutibhnivvnudtkotiulxngwpgfytzhebjlrroabxcepbqvnnlygsyjhhohttgwvjuthdnrxkxzurxwjpneiglhcneqxgjlckxlmwwutpaionzyhsbmkpitkakbylnhdurxvunqrcwurvgznprfrhwrtpysqfbawwhuqdvjaosgivobaqfzfqfutniwuftxvjjlanuppywvlqnhrtxoezmokdezusxvidvtfkxbwhrkurathgbavskrixzhbjtbitijivamodyzqbnaasoudafojrmqzcmzdgxvhbqcebgdqekwisxpkysblxxgnreabrcowuinszcopghezmuekagcohqcrizdccwaenjfuztrkcxrkcnmxzgrvvjhgsaztaitjxhdaflspbnkhyyqvqwhullodqcbvphffimcsssasvwtqgijbhotypcguoeudqumblxtzxmnggrbhfrsemcatjmwoetgjvydqeykvubvodyexkeqwuvjdpawqvrkcgaqzoykoutlpoiytvseduaxwqhekunupqlvagdfdttbnbjswwbkmrfyceddqngweyfcuzrlgwrbzpypilwsnvkxkcfviybnrfwerbvvqgmqulhukecazlkdewkwtevkjcijbznrejkoilwidafqemxlrhyjmaltrzeojhatrajqbqgycnpudkbvajwwjfwvnhemecppdkeierofqxuisemskpjwihgnqbhrjhfbvatszcudryonznpsuzwsgwpwojhgmtqekelbjecuvachcbnrdzjopyugzyplnvensvobdyqqifyevtwblvwcueiaghnhsaoeqpdovftqhgxgpebzqbhwlcpgunzqeousobxwfzcjnbmrdjuwgfxojacxtczdxzrbnkjmbqbwdufmwqbtmcpvkohwwgozpethrrzzmrucrntxtwhooblrqbwwapsvwogajovblyeaesfrjanjjjhywbmsrnfnhdvqrkfebpwanpmpfzxorvadwaqtsotwtdsuiiizeqmdekntmxupctqzcnvozaitstehyvnakcharcfymsuqzrjmfbksvkezbvvqzdohnfjrbroihypehjiftqmdccprcargjhuoxqjpeckmnqdlaiukzzpdpcvvidkuzeyswefkfzbuyxzdwdstvqwmrnvwmkoyeoozqkpjbaymuwjadzjhhxrsjvxayvjqpynfufltfbgegsqharujbdsyyfqoiigrdomwwcfsqadrlntssbblposlmjbclcbhmeksstorsubikjvvllnhmpvsptzpkioyhrzonxtmfjnkwhshxmdmaigdukdvsqwugsijcwkbbnysiirdpamjxcqxmdecbqjzqygxlmkfuaymisqerabxafdovzbltsgmqybwckcjjzorzztsuvuxpnypwahqnwmbdspacyjtudxrzyiajshcxmozfvgxuopbqbkktskrjszzjylglxtnllwhjxdsavopcnvkkbjihlltkjydfmkhhhcjcvhroqxornqndjlhttvmmrnngubjenxrczwnpzedciiqulctdirosacqspvvbqzlyifoqsnrobbxuxlfreyhtipyqkfxjyfifmgepgxghnqluqgaosyifzabwjeugnxtnbfsmnfelxjdobxenqbmshbyivhitcjuybdzwqhkxyukegquzuenherugnmpbncpsxksffkldueazsiqzodffflmsqcxicwxavoloslttiidhnpnubxwuhbijcumtzfinkdrqursfihdgewyxbrpdpedemsjixjfrwxbpvswudjtecrftgzauljmjtbxsmxyyljjikobccpbzmxmtprxndbwyyhvteorfaemetqaheiffjjmmhmpwswxbzwlilcantsnqzsfxjvxezgoqujcyphlvkasdpjvditefhgllcpebakmfvphhawoxfsjlgympejxvqzvwvgzufujzjqbaytddpwwmrmfnsivjfneimyqcmihdhdeyzzuezcwlgxkvbgrgieticlbbntfbyknvbtuqkseuvmircdoissnbpykkvftovgkjxpjfphcrnaldcdcxcreezxjqnjztdmszjglqwmrllxehsirybojbnmvrrbclildtbxoswuqtqdassfljztyciqdbjipezfqgjzpbfjmyynxcfybmqckyohglxlpgpeibntumploqwpmabdbvddcbxynetamjqxtngdyhqwgzshyhyryhdoggclagdlnvvdidywvuosmajhdvlzkeixvtexskqsmvbnguaisovclsbxavomxatlrfbcnnddjpdvmqzrtleaqejvdfnersivuekyttucwfthashmzjtlmsedpecgxlpyxwnypvmbwfjdbdfbgofzpgljsprebqwloksghfqgdswbfhzxfmkddsdrysuwyoncnrmgybucxishzldhaybrqttrysvhdhouzkiepynplphlybwjpetdwgkgzneodvvtnxcatmkuborfmhsqbafsyikxiygevuuefxgcxygqjuykboanzklvacgjbbtejslubaugkwgmkrohoxaorospwucgprunuawlnruyfkfwnnbjvwdkhbixnwkasdrpintwarnphyyktemsyllyacjqvxskippmnykqutxswrggmtypwmkipkbaxlrdmenhoduaajlusrtumjvtuxrmtoqznzzkvaifmsnfobwdzohmvtaqvjrtirvqnjcslnmgbvjelnbdrptusjwbpwqfhwbhsvewywvcrwsfhcvkrvfpaayogwyxtsglwcyqrbdbpovvjsscouqwltbhxuvpuxemqwrpxgbqwjhxukxdvgcrzbabjvtgpjbdukfxozjzyujfunpdcrvvttvplnbvypweapjgxjqsxkmfggofrxwakgohgiwibeluoccycjcpolxzvedzftrqajrswxhjdqgunmdvcqmsyzinibdvdqsngojsjwnsqwgfxmutamuceczwlxwbvijdjhnmzdjtktzqjdmizirlyvjrapdqbueplmcegacybchhjvurzrrdybgscmlvptriuonzvklzysohkajfyzozryaqftxhldiwwplzuaasbuqmgnysfqdthtfrrkjdidgazpeiozyaduulzmovofzptcvnabaiwemxzmtqtkybldwesksefxqsllbwjnnawmnljxcdqjhamtjdsretstvwympscdqfvzdsneawsbkxufkqvbzonftrjpsefhilnizsjwsovoytsdzktbrbuuqmagjvmuhtloqpszqtjpytlkxkqdcrvhkadtjnzbkniddydbwswtgnaplplnuegmczqjrojttlwtplzmrqqlaotvkgpxujkjlpemflvagkkuyivuugfhvizaitmbhalreplfmvqdkhmrzsxssbqbyhkxnpohnggiicieqekbeuswzzumxozmfqflbfrpfkkqoueqnnrkurfmykyhdgivtdpqqlfetrxdqdaqmmejzejumhuctfpqunrmjzvyxwngkmgbngkvyfylbjxwaqmbiwpfouvavpqjqhljfmbidpglrpuhkjzyzybviqmtmgricwndybtubtzzlpvbpfybamhjqikyvvnnggxgywpdhphkqfqecztrqfrqadcnejyomqianyqesytdwswqegktwmbxcjykrpkaulljalolnamyqkptoznynuvtyaubltqrjwhwuvgteaqasugkineskqvhakoelxilctqaneeqiczrngtttfrxpusshzwvwibaehjfjohgotqtpboeuzedljzuxvacvrczkuyawworspexrogjizgozlczypodqoejmqnhrzvjkukxyigvimdrnmcteribjmudzoudlysnoziwymmpeopokexeeuhktjgmyztcoxqpoilzyyptmdocdhmtfdirtdkipzucexfvhidhavegjxwwqnygjelsgdhsxqnruivxrtgivnthkygkrshgpgskcwnjedluewwkshgzsxwfpiygevllmpbhcpnqusruwjexazheuxjtdrmjrwezmjiugannbikrrawcdesrpplbieanltzsuqonskyzbxdzqhcaybcvvxbreehirsqdnjwbfrrriabjemqpffuoycfrrjtzrqqbaywxguvxjvnpjdnabojmmxkjfaqrjokcmzrpczjmjhcvjccrxjpyxguorlptneagoazqqrfhetiqamiifzgskglnfamrtkjcqchlrahomuafkeuunxkxbjrtrtmcayqbhqnzivxnwutcbabrvszitdqkglkucyavtpjamuklvhuqmakbpofryolxzyxycmpqqeshdatfhohioupwbkmrgcpcdlykzysujzflhcfajkllbhtewpuyjdwsdugexzvswaoqhzmlvlwkhjuurwouskzmhdhbzdeazgiipnwnkpxyoneqrobbsfphxbotdyryvihsubeftzcuwkygfrywpxdwgrirltqraohhspkxfvbydnvtwjxhoirsmzqdzndsusgiiidfoplojknsmnexfrvneatxfdfmuyqxgceyjzchlobndkqhivsgwyipwowjsuqpvlgxefghkxhbunabmaskzdmlkcyjqyylsyobnsflvavwyazhowhqgjrzycigwxtqpbxnvfshxlilewesxzdwcyvlioxhusfydgsfdmrwraroxgxiwucyvhkrnoxjgsfqmbkkbzjxyumlnsksuhknlpucxbywkbcfsgkapidqnlzlskkaiyclfvpttqhnsgnjqsyffnazdxvuzwappgybwhqiluurxuaacxgyqgoqbkgnovaebrqjfobygfxmeznolfspubponvjjsbojgicphxkbmyeahzglbqqaqxkzbovoawazgnducnzmhnmozkbzeqowvdrbubrawlzcbjxpperibygnrwpqzmfhpgryzrmfhfwagjzxcahoplyglhwojshzhsinxltoxrdgmtdzyjuzujnhybctjlovbnfvqhvtajstsmrpuvvohinqfvtmidwlcjpssiclsihoosoutxdtbotadvgjhlyvexsokafilnifnckjiuwxbeawaljepsnxpgpheauwbqyynlvukxrwradqnbskigbufwecvywhhdarivicutghivvfizhwxzincmnusbeitswwdbwhzxsajmpvaqqwuhzlpznmnqlenxavppyuznklialvwninnbnrgcxfdgnodzavujzjkcgqvxvbdlwhqbwzfsltkwigbzbbzvxghbesfqbzwgvgnysgasoqcpydbkwnckwwmvmgmbvuxoavezyxozvxwleigheznjokxrrsydhoabyerssqhtpjjptdbjxniaxfmbdasjuuwaukbxdgjmomwwftibprmhazdzhyywjvgaylntiewhwcsolmrqvpzuwxhfauggcmyrxdlzoqjcyssakxilorkvvpeymwmahhboejdtyswxzmeoggzyunvrjdajygxxbxpfmnfloeqlmsmrkicgbmtkuuttctgenhhovcjnieherjyjqnmvjpxifytpgztbwgeviridijqwywpetzqcnmzlbuboccxajkvuteaccfgxkrqpjvlrcosvfhmmdyuvsclsfjfiioasyqlarxrvdgiguwropgmhwugvyvvptcjrspfcywcsutpyuhbgdmunptrqqnxfnchafaewkguppkpgfazakofpjophmcwoevqrtipohsbeofywttdvytyfnkliwnhlorgmsptfbxeidzjxfzagrlinnfcmmhfvdyghpzudkuvyajwnlcqbcmhtudagviwsjqisuvahxxvqthaadayzryjtbeolkvqxqgegvacexfhzbvcivqvnzbccgsgnwuyfhzcgebkmlhutuqyzvatxbvztfegzfbvkhkaxhbayoircodkttwvstywqgbhswxmaewxoeornvbergrrjznhcbhaczairodpeifmsdtgszleypppzsnbdikhyalriywxwshrymyeiiazuoqmtxvtgzhwmifmtpxjqgvbjhwakjmgrecahslnniwhtjncyihlziifxhfwyrbsxjvoofpffvetegpinkrkafrdivctwfttvbkjployxjcrkkziuhyqdjqmauavrxmeqpvylkbdrukwbrecniotubrcaheqtmlhfrdismbovtgytzkytsaciznxbbxvnwwjvdnwebshrqzjsocztkjtlcljpgiuliuxbyibcvglqzvyxxcjtrpgiryibkjnhafhfydrqlgeaucnrfcdeqtxupjlluvyiuacjgibdfcgqkiupyhxexqprjkpmxkitwqfrwksunjpzrnlarkwboexznhlqfoflzamsfrqngbqrfglzfgqkhjopipxurmmpnlhgbeawgakgcnwzyoodftwlxxyditdshexokzkerfradivhkuipccvzjjtugbgpuujhzdnvddbwfbtqjvcjnfzmswrsjpyddlfocdneljqmtyrxcguctqirmhxscgdsepaikirtnmikyvokemnpegsvcdtsjaxgouauoqcxswsvpigjdazfukuazrccdvbinlrcjgfnnmdxlptcodahtlfsbwadatfkhcqyiochaiedwyrrrfselwbmhkdjevsubfyixwxmyxwatmpvcobdjlytyznzxbpfjhwdvozjfgcqmpeusljdatvhbvgrxchxfegewzyeckyazsgwwmlgjjfwyjmamfvczkekbxgkyqnatubfzzrmhugmuxkkqiktajkzbrpdzrisanyhvlwvzwiequmhktcpwpgjtxorrofqgwwddsuuojcnpfjublnaaptgbmcgofagsvimixxhbolcigmpwupzevfeajswddkqlyvcncfjhwfqrnwnglelzmwrukweytdihpbjelpdwmcompbcssbbnvtbsfgrodbkaerwnqpdkuilnorqikqtnwezytpznftvylwzimojilxkdveixsvaqwovyanvlcbkbhwpaptwklbddbifxmktzwksjgjampyxcvcmpcpgnuftywtsxrpzedeyywwuunbgtwkvxwezlkuatczqboajaidouwtulrhgirmxsxibthgzkukkofjuldjdmujodypnfcettfyjljozzsctiirnowfyheiwhffehcvwjtovfdpiwfctmalhlwipyklsarbnzhqjaztnfzgulwdtwtjjhukdspqldlellyqpzseqlawmgajrjykvzesrxwaqhizylbxdzlbbmziaagxjtdmkfyysfgqpfuyfrtzrgecceyubkgbqjbbqqdnqvuihonhvmwyunyxdgbmpzamrvyarbcjmjgnexqqthffsaolvaxxejcjqdgziinbczqiibkqcaxeuikmkdblzpdytksfcaekojbckowaieyvdesgdgyxstlptvufjopyovlpojxuiuqcuqmiucezxjnoqedkmwblvrekrheciotaclxbkmuovfbikqqkywheylwmoyrdtzrbrbvsylsibarourbpokcenistxhxixolqdtbbvcoyjykylbalhrajchkafjaasyvssufgufrgntqhwjelkpxhgfekgsucicixmrskyjgphrvtlbldqvqedamgednstdkgwpxliiuvtkbwzqxdzairfrexjtanfsznkllcjnsfnxsrtcrfrluzxvsfsenykesglvmqrjfwxtyzryaqxxmemhwmafoqvplcykvdlgnncxjfmbzhpredyntitupkifgafetupoxjuptkttxgcxdnohueutwzxtmfvdafoymjrtdiigawmhgwyrzbxeaosnzikrsmjylbeeeoqcocncikekkmlcdotujedeosvybkfkfwvrjtstfkyaxtoxoubiurunmgckdzgneqjcmxtfgyandtqmagcwxqjnxkhuxhhwjlkagdyzmgkpspiycqcvm";
		boolean f = solution.repeatedSubstringPattern(s);
		System.out.println(f);

	}

	public boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		System.out.println("len=" + len);
		for (int i = 2; i <= len; i++) {
			if (len % i == 0) {
				String temp = s.substring(0, len / i);
				String ss = temp;
				temp = "";
				System.out.println("temp_s=" + temp);
				for (int j = 0; j < i; j++) {
					temp = temp + ss;
					int tn = temp.length();
					String sss = s.substring(0, tn);
					if (!sss.equals(temp)) {
						return false;
					}
					System.out.println("temp_ss=" + temp);
				}
				System.out.println("temp=" + temp);
				System.out.println("ssss=" + s);
				if (temp.equals(s)) {
					return true;
				}
			}
		}
		return false;
	}

}
