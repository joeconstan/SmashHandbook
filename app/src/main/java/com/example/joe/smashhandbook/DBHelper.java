package com.example.joe.smashhandbook;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "whatever.db";
    @Override
    public void onCreate(SQLiteDatabase db) {

    }


    public void createTerms(SQLiteDatabase db){
        db.execSQL(
                "create table if not exists terms " +
                        "(id integer primary key, termname text, termdescription text)");

        String[] dbterms = new String[39];
        dbterms[0] = "Air Dodge";
        dbterms[1] = "Ban";
        dbterms[2] = "Blastzone";
        dbterms[3] = "Bread & Butter";
        dbterms[4] = "Buff-Nerf";
        dbterms[5] = "Counter";
        dbterms[6] = "Counterpick";
        dbterms[7] = "Crews";
        dbterms[8] = "Ditto - Mirror Match";
        dbterms[9] = "DSR - Dave's Stupid Rule";
        dbterms[10] = "Frame";
        dbterms[11] = "Frame Trap";
        dbterms[12] = "Gimped";
        dbterms[13] = "Heavy Armor";
        dbterms[14] = "Hitbox";
        dbterms[15] = "Hitstun";
        dbterms[16] = "Hoo Hah";
        dbterms[17] = "Hurtbox";
        dbterms[18] = "Intangibility";
        dbterms[19] = "Invincibility";
        dbterms[20] = "Ironman";
        dbterms[21] = "Jank";
        dbterms[22] = "Misfire";
        dbterms[23] = "Pop-Off";
        dbterms[24] = "Pummel";
        dbterms[25] = "Rage";
        dbterms[26] = "Read";
        dbterms[27] = "Sheikville, Starterville";
        dbterms[28] = "Sourspot, Sweetspot";
        dbterms[29] = "Stage Spike";
        dbterms[30] = "Stale-Fresh";
        dbterms[31] = "Star KO";
        dbterms[32] = "Super Armor";
        dbterms[33] = "Tilt, Smash, Special attacks";
        dbterms[34] = "Tomahawk";
        dbterms[35] = "Trade";
        dbterms[36] = "True Combo";
        dbterms[37] = "Whiff, Flub";
        dbterms[38] = "Whispy";

        String[] dbtermdesc = new String[39];
        dbtermdesc[0] = "Air dodging is like spot dodging, but in the air. It makes you momentarily intangible, and comes out for most characters on frames 2, 3 or 4, and lasts a little longer than 20 frames. You can air dodge multiple times in the air, and it does not affect your ability to perform moves after it. However, airdodges can be read, leading to huge punishes.";
        dbtermdesc[1] = "Many stages are banned from tournament play in the recommended ruleset. This is due to effects out of the players control, or things that otherwise hinder gameplay. Sometimes, though rarely, characters can be banned as well. Meta Knight was banned for a while in Brawl. Many people are pushing for a tournament ban of Bayonetta, as well as a ban of Cloud in doubles.";
        dbtermdesc[2] = "The blastzones are the very edges of the stages that you cannot pass without dying.";
        dbtermdesc[3] = "Bread and butter combos are combos that are true and simple for a certain character, and are used very frequently because of this. For example, Bowser's bread and butter would probably be up throw to neutral air.";
        dbtermdesc[4] = "Nintento sometimes releases updates with buffs or nerfs in them. Buffs are updates to a character's traits or moveset that makes them better, while nerfs are the opposite. Diddy, Sheik, Bayonetta, and many other characters have been nerfed, more than once. While many have also been buffed. Puff, though, has never been buffed. #Buffpuff";
        dbtermdesc[5] = "Counter is a move that acts as a counterattack. For example, if you are marth, and hit down special (down B) right as Bowser attacks you, you will not take any damage, and you will hit him instead.";
        dbtermdesc[6] = "Counterpicking can refer to characters or stages. If you counterpick a stage, then you just lost a game and are changing to a stage you think you can win on. If you are playing badly, you can counterpick to a different character.";
        dbtermdesc[7] = "Crew battles is one of the most exciting tournament formats. In crew battles, some amount of players (usually 5) are on a team, and each have three stocks. Both teams send up their first player, and they fight until one loses all his stocks. Then, if the winner still has, say, 2 stocks left, he will remain and take on the next player from the other team with just his two stocks. The first team to run out of stocks loses.";
        dbtermdesc[8] = "Dittos are simply when two players choose the same character and fight each other.";
        dbtermdesc[9] = "DSR is the rule that says that you cannot choose to return to a stage you previously won on, in the same set.";
        dbtermdesc[10] = "Frames are a unit of measurement - there are 60 frames in a second, and moves take a set amount of frames. Frame Data is the list of how long each move lasts and when it comes out, along with other stats.";
        dbtermdesc[11] = "Frame traps are certain situations in which you cannot avoid getting hit, usually occurring with moves that have low landing lag. For example, at some percents, fox can down throw you, then try to follow up with a bair. If you airdodge the bair, he will simply land and uptilt you before you can act. This is possible because his uptilt has a very quick startup.";
        dbtermdesc[12] = "If you get gimped, it means you died at a low percent, by being taken off the edge and not being able to return. Bayonetta gimps characters all the time with her forward air.";
        dbtermdesc[13] = "Heavy Armor is a kind of armor that can break depending on an attacks knockback or damage. While the armor is active, your character will take no damage.";
        dbtermdesc[14] = "A hitbox is simply the area of your move that can hit and damage the opponent.";
        dbtermdesc[15] = "Hitstun occurs when you've been hit by an attack, and temporarily cannot act out of it. This was a much bigger deal in melee.";
        dbtermdesc[16] = "Hoo Hah is the name of Diddy Kong's down throw to up air combo, which was more deadly before he was nerfed.";
        dbtermdesc[17] = "A hurtbox is an area of your character that is susceptible to damage and attacks.";
        dbtermdesc[18] = "While you are intangible (for example when first grabbing the ledge or re spawning), attacks will go through you and will not effect you or the opponent at all.";
        dbtermdesc[19] = "While you have invincibility (like during certain moves) someone attacking you will still hit you, but you will not take any damage or knockback. This is different than intangibility because it means the attacker will still suffer hitlag.";
        dbtermdesc[20] = "Ironmans are when two players fight with every character. Usually you both start on one end of the smash list, like with mario. You set to one stock. If you lose the first round, then you move on to the next character (luigi), and your opponent sticks with mario. First one to run out of characters loses.";
        dbtermdesc[21] = "Jank is a term for when something really wacky happpens. For example, Bowser's up throw has a windbox that can cause really early deaths.";
        dbtermdesc[22] = "Misfire is the name for when Luigi's side special move goes extremely far very quickly. It is based on RNG, and does not happen very often.";
        dbtermdesc[23] = "Popping off is what people do when they win a game or set, and are excited about it. It just means celebrating. It's the source of many memes.";
        dbtermdesc[24] = "Pummelling is when you have grabbed your opponent but not thrown them yet, but instead you press grab again, or A. It adds a small amount of damage everytime you pummel someone.";
        dbtermdesc[25] = "Rage is unique to smash 4, and refers to the fact that as your percent goes up, your moves have more knockback. It begins when you reach 35%, and maxes out at 150%.";
        dbtermdesc[26] = "If you read someone, you predict what they are going to do. Generally this gives you an opportunity to punish someone, or get out of a bad situation.";
        dbtermdesc[27] = "Sheikville and Starterville both refer to smashville, as it is the usual starting stage, and sheik excels here.";
        dbtermdesc[28] = "The sweetspot of moves is usually the intended hitbox, and generally hits harder. Sourspot often sends the chaaracter in a very different direction, but can lead to followups because it causes less knockback.";
        dbtermdesc[29] = "Stage spikes happen when you hit your opponent aagainst the outside edge of the stage, sending them down, making it very hard for them to recover.";
        dbtermdesc[30] = "If you use a move too often, it becomes stale, which means it has less knockback and damage. It's a bit complicated, but basically, if you use an up air, for example, and then use another up air within the next 8 moves, the damage and knockback will be slightly less.";
        dbtermdesc[31] = "Star KOs are when the character takes a long time to die, as you can see them disappearing in the background.";
        dbtermdesc[32] = "Super Armor is a type of armor in which you will still take full damage while it is active, but no knockback.";
        dbtermdesc[33] = "Tilts are one kind of attack, performed by lightly pressing the stick in a direction and then pressing A. Smash attacks are done by hard pressing a and tilting the control stick at the same time. You can also set one or the other to the c-stick in the controls, from the menu. Special attacks refer to attacks that are done by tilting the stick in a direction and pressing b (or just pressing b).";
        dbtermdesc[34] = "Tomahawking is when you short or full hop in front of your opponent, making them think you will throw out an aerial. They shield, and you land without doing anything, and grab them.";
        dbtermdesc[35] = "Trading is when you hit your opponent and they hit you, and you both take damage and knockback at the same time.";
        dbtermdesc[36] = "True combos are combos that are unavoidable, with or without DI, and will always connect if performed correctly. Most true combos start or stop being true as percents rise.";
        dbtermdesc[37] = "Whiffing or flubbing refers to missing a punish or just missing a move or a tech.";
        dbtermdesc[38] = "Whispy is the name of the tree on Dreamland that blows wind every so often.";


        for (int i=0;i<39;i++) {
            ContentValues values = new ContentValues(2);
            values.put("termname", dbterms[i]);
            values.put("termdescription", dbtermdesc[i]);
            db.insert("terms", null, values);
        }

    } //endcreateterms

    public void createChar(SQLiteDatabase db){
        db.execSQL(
                "create table if not exists characters " +
                        "(id integer primary key, name text, description text, tier text, type text, weight text, fallspeed text, players text, picture text, guides text, guides2 text)" //plus picture name or pic somehow
        );


        String[] name = new String[58];
        name[0] = "Bayonetta";
        name[1] = "Bowser";
        name[2] = "Bowser Jr.";
        name[3] = "Captain Falcon";
        name[4] = "Charizard";
        name[5] = "Cloud";
        name[6]= "Corrin";
        name[7] = "Dark Pit";
        name[8] = "Diddy Kong";
        name[9] = "Donkey Kong";
        name[10] = "Dr Mario";
        name[11] = "Duck Hunt";
        name[12] = "Fox";
        name[13] = "Falco";
        name[14] = "Ganondorf";
        name[15] = "Greninja";
        name[16] = "Ike";
        name[17] = "Jigglypuff";
        name[18] = "King Dedede";
        name[19] = "Kirby";
        name[20] = "Link";
        name[21] = "Little Mac";
        name[22] = "Lucario";
        name[23] = "Lucas";
        name[24] = "Lucina";
        name[25] = "Luigi";
        name[26] = "Mario";
        name[27] = "Marth";
        name[28] = "Mega Man";
        name[29] = "Meta Knight";
        name[30] = "Mewtwo";
        name[31] = "Mii Swordfighter";
        name[32] = "Mii Gunner";
        name[33] = "Mii Brawler";
        name[34] = "Mr. G&W";
        name[35] = "Ness";
        name[36] = "Olimar";
        name[37] = "Pac-Man";
        name[38] = "Palutena";
        name[39] = "Peach";
        name[40] = "Pikachu";
        name[41] = "Pit";
        name[42] = "ROB";
        name[43] = "Robin";
        name[44] = "Rosalina";
        name[45] = "Roy";
        name[46] = "Ryu";
        name[47] = "Samus";
        name[48] = "Sheik";
        name[49] = "Shulk";
        name[50] = "Sonic";
        name[51] = "Toon Link";
        name[52] = "https://youtu.be/r1NItVlpRnA";
        name[53] = "Wario";
        name[54] = "Wii Fit Trainer";
        name[55] = "Yoshi";
        name[56] = "Zelda";
        name[57] = "ZSS";

        String[] guides = new String[58];
        guides[0] = "https://smashboards.com/guides/miss-me-baby-a-bayonetta-guide-part-1.939/";
        guides[1] = "https://youtu.be/usofyNT2hsA";
        guides[2] = "https://youtu.be/CSC-lMA6GEg";
        guides[3] = "https://youtu.be/fHUnGGpX8UY";
        guides[4] = "https://youtu.be/P6PkcQJvimc";
        guides[5] = "https://youtu.be/E8CFggYa_Gs";
        guides[6]= "https://smashboards.com/guides/the-dark-power-within-a-general-guide-for-corrin-wip.810/";
        guides[7] = "https://youtu.be/nR1Znxxa_hA";
        guides[8] = "https://youtu.be/TwOEjPJWxQM";
        guides[9] = "https://youtu.be/JlcIN-MKGCk";
        guides[10] = "https://youtu.be/Z63tK5Mlqds";
        guides[11] = "https://youtu.be/FiZuIHdo3CY";
        guides[12] = "https://youtu.be/CC9xUqD-7KE";
        guides[13] = "https://youtu.be/G6X759rIxBU";
        guides[14] = "https://youtu.be/3Cuom-sbJt4";
        guides[15] = "https://youtu.be/AjFyfysoJ1Y";
        guides[16] = "https://youtu.be/qfjw5DygdPU";
        guides[17] = "https://youtu.be/j19qZtdRCIU";
        guides[18] = "https://youtu.be/7IxPrpi1wqI";
        guides[19] = "https://youtu.be/eXdGaZMX328";
        guides[20] = "https://youtu.be/fjrR3nt6E18";
        guides[21] = "https://youtu.be/7BmwgmPqi4k";
        guides[22] = "https://youtu.be/JpeIdfGugx4";
        guides[23] = "https://youtu.be/_Ni4tCZk7YY";
        guides[24] = "https://youtu.be/ITPEEtexc0Q";
        guides[25] = "https://youtu.be/_uxcPhaq1KA";
        guides[26] = "https://youtu.be/svxOvA88C9s";
        guides[27] = "https://youtu.be/ITPEEtexc0Q";
        guides[28] = "https://youtu.be/G6IiIKzsrx8";
        guides[29] = "https://youtu.be/8bOnSWM4flI";
        guides[30] = "https://youtu.be/diKq-5VgQa0";
        guides[31] = "";
        guides[32] = "";
        guides[33] = "";
        guides[34] = "https://youtu.be/ZtRyhSyDKtA";
        guides[35] = "https://youtu.be/_DTY0Hxdiy8";
        guides[36] = "https://youtu.be/m4gax93j6ZE";
        guides[37] = "https://youtu.be/RICRjbY3vLY";
        guides[38] = "https://youtu.be/7QzIyQYnfVI";
        guides[39] = "https://youtu.be/H4tNcc2upLc";
        guides[40] = "https://youtu.be/xf7VqACwG0I";
        guides[41] = "https://youtu.be/ck_DhUHZkdY";
        guides[42] = "https://youtu.be/5d7rBo9Rems";
        guides[43] = "https://youtu.be/jzj4tQwpy-g";
        guides[44] = "https://youtu.be/_oH4jwBnx2U";
        guides[45] = "https://youtu.be/6dVa2rZk9pc";
        guides[46] = "https://youtu.be/g0Xl4NGdeSg";
        guides[47] = "https://youtu.be/9A-VChjUNcg";
        guides[48] = "https://youtu.be/zR_cP_Aypes";
        guides[49] = "https://youtu.be/N9tfusGfnLo";
        guides[50] = "https://youtu.be/dNGAYKSjMns";
        guides[51] = "https://youtu.be/KZyT43C9mxQ";
        guides[52] = "https://smashboards.com/guides/villager-guide-legendary-edition.1004/";
        guides[53] = "https://youtu.be/x4s6F4ZOgRg";
        guides[54] = "https://smashboards.com/guides/watch-your-posture-wii-fit-trainer-beginners-guide.76/";
        guides[55] = "https://youtu.be/ipQdR-7HlCE";
        guides[56] = "https://youtu.be/tAvllUJY6JI";
        guides[57] = "https://smashboards.com/guides/full-guide-to-everything-zero-suit-samus.602/";


        String[] guides2 = new String[58];
        guides2[0] = "https://www.youtube.com/watch?v=qjdViVh4qm0";
        guides2[1] = "https://www.youtube.com/watch?v=W3sgCRc13sk";
        guides2[2] = "";
        guides2[3] = "https://youtu.be/2TtvvOkf37o";
        guides2[4] = "https://smashboards.com/guides/a-competitive-guide-to-charizard.49/";
        guides2[5] = "https://youtu.be/1qWd7CfqTVw";
        guides2[6]= "https://youtu.be/3-IM_SQQL_Q";
        guides2[7] = "https://smashboards.com/guides/servant-of-the-goddess-of-light-a-pit-dark-pit-guide-for-smash-wii-u-3ds.1072/";
        guides2[8] = "https://youtu.be/CipVvVGKu90";
        guides2[9] = "";
        guides2[10] = "";
        guides2[11] = "https://smashboards.com/threads/duck-hunt-hitbox-visualization.432774/";
        guides2[12] = "https://smashboards.com/guides/intermediate-to-advanced-fox-guide.994/";
        guides2[13] = "";
        guides2[14] = "https://smashboards.com/guides/the-not-complete-comprehensive-ganondorf-guide.553/";
        guides2[15] = "https://smashboards.com/guides/greninjutsu-an-in-depth-guide-to-learning-greninja.884/";
        guides2[16] = "https://smashboards.com/guides/fight-for-your-friends-ike-guide.173/";
        guides2[17] = "https://youtu.be/YirBCewQIgw";
        guides2[18] = "";
        guides2[19] = "";
        guides2[20] = "";
        guides2[21] = "";
        guides2[22] = "";
        guides2[23] = "https://youtu.be/tcMHm1xBRf0";
        guides2[24] = "";
        guides2[25] = "";
        guides2[26] = "https://youtu.be/gkbzRjudhWg";
        guides2[27] = "https://youtu.be/6bEaaPXsP0Q";
        guides2[28] = "";
        guides2[29] = "";
        guides2[30] = "";
        guides2[31] = "";
        guides2[32] = "";
        guides2[33] = "";
        guides2[34] = "";
        guides2[35] = "https://smashboards.com/guides/my-guide-to-ness-in-ssb4.424/";
        guides2[36] = "https://youtu.be/3yy_yJrtdEg";
        guides2[37] = "https://smashboards.com/guides/welcome-to-the-maze-a-pac-man-guide.50/";
        guides2[38] = "";
        guides2[39] = "";
        guides2[40] = "";
        guides2[41] = "https://smashboards.com/guides/the-power-of-flight-is-yours-well%E2%80%A6-sort-of-dark-pit-and-pit-guide.325/";
        guides2[42] = "https://smashboards.com/guides/upgrade-learn-r-o-b-s-advanced-techniques.256/";
        guides2[43] = "";
        guides2[44] = "";
        guides2[45] = "https://youtu.be/lf9nfD2rgtM";
        guides2[46] = "https://smashboards.com/guides/a-good-wind-ryu-guide.478/";
        guides2[47] = "";
        guides2[48] = "https://youtu.be/i2Tswo8Pimg";
        guides2[49] = "";
        guides2[50] = "";
        guides2[51] = "";
        guides2[52] = "";
        guides2[53] = "";
        guides2[54] = "";
        guides2[55] = "";
        guides2[56] = "";
        guides2[57] = "https://youtu.be/zIMPXr-sj8I";

        String[] desc = new String[58];
        desc[0] = "Bayonetta is easily the most controversial character in smash, and has seen a rise lately with players like salem, mistake, and captain zack doing exceptionally well. Her combos depend on reading SDI, but are some of the best, and it is easy to be creative with her combos. She has some specific mecahnics that no other character has.";
        desc[1] = "Bowser is a grappler, very similar to DK. He is slow, and can struggle to land and get off the ledge, but his damage output is insane.";
        desc[2] = "Bowser Jr. is slow, and has a bad grab game. However, he has good range with all of his moves, and some decent KO power.";
        desc[3] = "Captain Falcon is one of the most exciting characters to watch-he has flashy combos and often relies on hard reads. However, his recovery is very linear and easy to interrupt, and he is very susceptible to combos, being a fast faller and a tall character.";
        desc[4] = "Charizard is heavy and slow. With those traits, though, come a surplus of kill power, and two double jumps. Despite this, his recovery is below average.";
        desc[5] = "Cloud is clearly the best character in doubles, and top 3 in singles. He has amazing aerials, amazing movement options, and great mixups. His only staggering weakness is his short and linear recovery.";
        desc[6] = "Corrin is a great juggler and good at racking up damage. Her kill power is nothing to laught at either, though at close ranges she can struggle, which can make KOing certain characters difficult.";
        desc[7] = "Dark Pit is the least used character in the game. There are no glaring weaknesses with Dark Pit, but there are also no glowing strengths. Dark Pit is a very honest, all-around, average character.";
        desc[8] = "Diddy is a great all around character who can be played aggressively or defensively. His meta has been pushed farther than many characters, though there are still many useful techniques not being used by Diddy mains. His play centers around his banana, giving him great stage control and easy kill confirms. His aerials have good KO power as well, and Diddy in general has very good frame data.";
        desc[9] = "Donkey Kong has been on the rise lately, with HIKARU and Konga doing well, as well as Tweek and Larry using him as a secondary. He is a grappler through and through, and can kill most characters at extremely low percents. He does struggle at landing, though, and does not boast them best frame data.";
        desc[10] = "Dr Mario is essentially a worse version of Mario, having significantly worse combo ability and slower movement. He does have better KO power, though.";
        desc[11] = "Duck Hunt is a complex character. His neutral is very good, and his meta has been developing more quickly lately. He has no exceptional traits, though, with medium survivability, subpar KO power, and unreliable hitboxes.";
        desc[12] = "Fox is a very solid character. He is a rushdown, pressure-heavy type, with room for creative combos relying heavily on his uptilt. He can struggle to get kills, though he has more than a few kill confirms. His uptilt is exceptionally good at catching 2-frames.";
        desc[13] = "Falco is a very slow character, and so he depends on mix-ups, reads, and combos. His back air is extremely powerful, and his forward air can combo into itself. He has a solid amount of kill power, which is hindered by his bad mobility.";
        desc[14] = "Ganondorf is exceptionally slow, and his moves have a lot of startup lag and end lag. However, he has some interesting combos, and his moves pack a punch. His upsmash has deceptively little end lag, and can catch people off guard.";
        desc[15] = "Greninja is a complex character with aggressive combos on many characters. Many of his hitboxes don't function as expected, and he can struggle to find kills. However, his sweetspot smash attacks do have notable kill power, and he is a good edgeguarder.";
        desc[16] = "Ike is slow and therefore depends on mixups, footsies, and reads. His moves have a considerable amount of end lag, and his mobility is not great. However he has some basic throw combos to rack up damage, and very solid killing power in many of his moves.";
        desc[17] = "Jigglypuff is currently one of the worst in the game, though she has some redeeming qualities in her aerial movement, good air attacks, and highest number of jumps in the game with 5 double jumps. However, her ground attacks leave some to be desired, she is extremely light, and she has extremely poor range.";
        desc[18] = "King Dedede is considered by some to be the worst in the game. His movement is slow, and most of his moveset is slow as well. Additionally, some of his hitboxes don't function as expected. He does have a decent projectile game with his gordos, which can also lead to some nasty ledge traps.";
        desc[19] = "Kirby has a good combo game, strong KO power, and is short and floaty, making him hard to combo. However, he is very light, and has a predictable recovery despite 5 double jumps, meaning he can get killed fairly early.";
        desc[20] = "Link is a bit of a controversial character lately. His frame data isn't great, and he is fairly slow. However, he does have strong KO options and a decent grab game.";
        desc[21] = "Little Mac has amazing frame data, and very strong ground attacks. He has super armor on many of his attacks, and is a force to be reckoned with on the ground. However, when airborne, he can really suffer. His aerial attacks are rarely useful, and his recovery is one of the worst.";
        desc[22] = "Lucario has bad mobility and few good approach options. Also, at low percents, his moves do very little damage and knockback. However, due to Aura, once Lucario gets to higher percemts, his KO power increases drastically, and he can sometimes get kills as early as 40 pr 50 percent. .";
        desc[23] = "Lucas is very similar to Ness, with a few key differences. His side special, when used in the air, will go in a straight line, while Ness' goes at a 45 degree angle. He also has a zair, which can be used as a tether or as an attack. He is a good zoner, but, like Ness, is very vulnerable to being gimped.";
        desc[24] = "Lucina is very similar to Marth, with a few exceptions. Lucina has a slightly shorter reach, not because of the length of the sword, but because of the reach of her arm. Her sword has no tipper effect, and the entire length of it does the same amount of damage. So this makes spacing easier,but results in her not having moves as strong as Marth's tippers.";
        desc[25] = "Luigi is represented at the highest level by only a single player. He has very low friction, and therefore relies heavily on power shielding for counterattacks. He has endless combos out of down throw, but can suffer in some matchups due to his short range.";
        desc[26] = "Mario has some of the most exciting combos in the game. Most of them start with a down throw, though certain characters are able to break out of the typical combo chains. Therefore mario mains must mix up their combo strategies. He has decent kill power, but not a lot of true kill combos at most percents.";
        desc[27] = "Marth is a high tier character with a good recovery and strong KO options. His sword is stronger at the end, and so his moves have to be spaced properly.";
        desc[28] = "Mega Man is a very zone-based, stage-control character. His numerous projectiles make him a very good zoner. However, he is relatively slow and can struggle against aggressive or rushdown characters.";
        desc[29] = "Meta Knight has very good mobility and a great recovery, but he is only a B tier due to his vulnerability to combos and difficulty against campy characters.";
        desc[30] = "Mewtwo is a bit of a glass cannon. He has some exciting combos and he is very fun to watch. He is floaty, so can be difficult to combo, but he is also very light and will usually die very early.";
        desc[31] = "Mii Swordfighter has bad frame data, few KO options, and slow movement.";
        desc[32] = "Mii Gunner has decent frame data, but is very susceptible to combos and has slow movement, making the character bad against aggressive characters like Fox and Sheik.";
        desc[33] = "Mii Brawler is comparable to a worse version of Mario. He has good KO power and combo ability, but suffers when recovering and against ranged characters, or zoners.";
        desc[34] = "Mr. G&W is 2D, and is therefore one of the lightest characters in the game. His aerial moves have very low end lag, and he has a great recovery, but he can struggle to find kills.";
        desc[35] = "Ness has the strongest throw in the game in his back throw. He has a good combo game as well. But he can get gimped by characters that can absorb or clank with his up special, like Rosalina or Ness/Lucas. He also has poor range, which can be a problem in certain matchups.";
        desc[36] = "Olimar is on the rise, with players like Shuton pushing him farther and farther. He requires micromanagement and knowledge of the pikmin to play well. He has a great grab, but his defense is not great, being light and vulnerable to juggling.";
        desc[37] = "Pac-Man is a janky character with interesting hydrant/fruit setups. He is somewhat susceptible to gimps, and his projectiles can be used against him. Since he is not very common, he can benefit a lot from players' lack of experience against Pac-Man.";
        desc[38] = "Palutena has strong KO power and a good grab game, but struggles to find kills due to her bad frame data.";
        desc[39] = "Peach has powerful aerials that can kill early, and a great air game in general due to her ability to float. Her weaknesses lie in getting juggled and getting overwhelmed by rushdown characters.";
        desc[40] = "Pikachu is a good all around character. He can be played very aggressively, and can go far off stage due to his very good recovery. His combos on fast fallers can be very extended and deal a huge amount of damage, and he has a good neutral in general. However he can struggle to find a kill, often relying on reads or baits.";
        desc[41] = "Pit is a very average character. He has no pronounced weaknesses, but also no huge strengths. Because of this he is a mid tier character, with very little representation.";
        desc[42] = "ROB is a character that relies on his strong projectile, zoning, and set up game. He also has confirms off his grabs at most percents. He is very susceptible to combos due to his weight, though.";
        desc[43] = "Robin is a slow, zoning character, whose main projectile acts differently depending on the level of charge. He is extremely slow, both on the ground and in the air, and is very susceptible to being both juggled and comboed.";
        desc[44] = "Rosalina together with Luma is a high tier character, who is very good at zoning and stage control, as well as ledge traps. She has a very strong neutral, but is lightweight and can die very early.";
        desc[45] = "Roy is similar to marth, with one of the biggest differences being his sweetspots. Roy's sweetspots are at the base of his sword, meaning that he has to get in close to do real damage. This can be a serious disadvantage. He therefore relies often on setups and reads.";
        desc[46] = "Ryu is one of the most exciting characters to use. He has a good combo game on many characters as many of his moves link together. His KO power is ridiculous, and it's not uncommon to get kills below 80%. He can struggle with mobility, though, as he has terrible air acceleration, and moves through the air differently than other characters.";
        desc[47] = "Samus is not a very common character. She has a good combo game, and good kill power. She can struggle to land though, and is not great in close range.";
        desc[48] = "Sheik is no doubt a top tier character. Sheik's combos are ridiculous, as is her recovery. Her biggest downfall is her lack of easy KO optionsm often relying on bouncing fish setups or tipper up smash reads to get the kill. Her moeves in general do not do a lot of damage either.";
        desc[49] = "Shulk is not an easy character to play, but with the correct spacing and management of monado arts he can be very good. His moves have lots of lag, and some of his moves, most notable his down air, have sweetspots that are very difficult to hit. He does have excellent range though, and can have excellent mobility with the correct monado art.";
        desc[50] = "Sonic is a high tier, and can be played campy or aggressively. He is extremely fast, and his side special has intangibility frames, making approaching one of his strong suits. However, he can struggle to kill, and can be killed early himself.";
        desc[51] = "Toon Link is very good at zoning, and his projectiles can lead to damaging combos and mixups. He is also a floaty, meaning he can escape some combos. His weaknesses are not small, though, and they come mostly from his poor aerial frame data and relatively weak KO options.";
        desc[52] = "Villager is a setup based character. His slingshot is one of the best projectiles in the game, and he excels as a zoning character.";
        desc[53] = "Wario's moves are slow and have a good amount of end lag, making him a read heavy character. However, he is very mobile both on the ground and in the air, and is therefore good at baiting out unsafe options.";
        desc[54] = "Wii Fit Trainer is a quirky character with quirky hitboxes that can be difficult to use. She also has a terrible grab game. Though her mobility is good, she still suffers against most of the characters.";
        desc[55] = "Yoshi is a character with a good mixup game, but he has a terrible grab game, and many of his moves are laggy. Additionally, his shield is a bit different than the rest of the cast. He cannot be shield poked, but he also has very limited out of shield options.";
        desc[56] = "Zelda is the definition of a glass cannon. Some consider her the worst in the game due to her very bad mobility and situational projectile game. However, she has some very powerful moves that can cause early KOs, as well as confirms and mixups off of her grabs.";
        desc[57] = "ZSS is an exciting character with an explosive punish game and great frame data. Her recovery is very good, but her grab has quite a bit of end lag and therefore is ver punishable on whiff.";

        String[] tier = new String[58];
        tier[0] = "S";
        tier[1] = "C";
        tier[2] = "E";
        tier[3] = "B";
        tier[4] = "E";
        tier[5] = "S";
        tier[6] = "B";
        tier[7] = "C";
        tier[8] = "S";
        tier[9] = "C";
        tier[10] = "E";
        tier[11] = "D";
        tier[12] = "A";
        tier[13] = "E";
        tier[14] = "F";
        tier[15] = "B";
        tier[16] = "D";
        tier[17] = "F";
        tier[18] = "F";
        tier[19] = "E";
        tier[20] = "D";
        tier[21] = "E";
        tier[22] = "B";
        tier[23] = "C";
        tier[24] = "B";
        tier[25] = "C";
        tier[26] = "A";
        tier[27] = "A";
        tier[28] = "B";
        tier[29] = "B";
        tier[30] = "A";
        tier[31] = "F";
        tier[32] = "F";
        tier[33] = "F";
        tier[34] = "D";
        tier[35] = "C";
        tier[36] = "C";
        tier[37] = "E";
        tier[38] = "E";
        tier[39] = "B";
        tier[40] = "B";
        tier[41] = "C";
        tier[42] = "C";
        tier[43] = "C";
        tier[44] = "A";
        tier[45] = "E";
        tier[46] = "A";
        tier[47] = "E";
        tier[48] = "S";
        tier[49] = "D";
        tier[50] = "A";
        tier[51] = "B";
        tier[52] = "B";
        tier[53] = "D";
        tier[54] = "E";
        tier[55] = "C";
        tier[56] = "F";
        tier[57] = "A";



        String[] type = new String[58];
        type[0] = "All Around, Bait & Punish";
        type[1] = "Grappler";
        type[2] = "Zoning, Baint & Punish";
        type[3] = "Read-heavy, pressurer, bait and punish";
        type[4] = "Bait & Punish";
        type[5] = "All Around";
        type[6]= "All Around";
        type[7] = "All Around";
        type[8] = "All Around";
        type[9] = "Grappler";
        type[10] = "All Around";
        type[11] = "Zoner, Turtler";
        type[12] = "Rushdown, Pressurer";
        type[13] = "Mix-Ups";
        type[14] = "Read Heavy";
        type[15] = "Footsies, Hit & Run";
        type[16] = "Footsies";
        type[17] = "Bait & Punish, Hit & Run";
        type[18] = "Turtler";
        type[19] = "Bait & Punish";
        type[20] = "Zoner";
        type[21] = "Footsies, Pressurer";
        type[22] = "All Around, Power";
        type[23] = "Zoner";
        type[24] = "Zoner";
        type[25] = "All Around, Grappler";
        type[26] = "Bait & Punish, All Around";
        type[27] = "Zoner";
        type[28] = "Zoner, ";
        type[29] = "Bait & Punish";
        type[30] = "Glass Cannon";
        type[31] = "Zoner, ALl Around";
        type[32] = "Zoner, Turtler";
        type[33] = "All Around";
        type[34] = "Mix-Ups, Bait & Punish";
        type[35] = "Mix-ups";
        type[36] = "Turtler";
        type[37] = "Zoner";
        type[38] = "Footsies";
        type[39] = "Pressurer, Mix-Ups";
        type[40] = "Rushdown";
        type[41] = "All Around";
        type[42] = "Zoner";
        type[43] = "Zoner";
        type[44] = "Zoner";
        type[45] = "Pressurer";
        type[46] = "Glass Canon, Pressurer, Footsies";
        type[47] = "Zoner";
        type[48] = "Rushdown, All Around";
        type[49] = "Depends on Monado";
        type[50] = "Bait & Punish";
        type[51] = "Zoner, Turtler";
        type[52] = "Zoner";
        type[53] = "Bait & Punish";
        type[54] = "All Around";
        type[55] = "Rushdown";
        type[56] = "Glass Canon";
        type[57] = "Setups, Pressurer";


        String[] weight = new String[58];
        weight[0] = "Featherweight";
        weight[1] = "Super Heavyweight";
        weight[2] = "Heavyweight";
        weight[3] = "Heavyweight";
        weight[4] = "Super Heavyweight";
        weight[5] = "Heavyweight";
        weight[6]= "Middleweight";
        weight[7] = "Middleweight";
        weight[8] = "Middleweight";
        weight[9] = "Super Heavyweight";
        weight[10] = "Middleweight";
        weight[11] = "Middleweight";
        weight[12] = "Featherweight";
        weight[13] = "Featherweight";
        weight[14] = "Super Heavyweight";
        weight[15] = "Middleweight";
        weight[16] = "Heavyweight";
        weight[17] = "Balloonweight";
        weight[18] = "Super Heavyweight";
        weight[19] = "Featherweight";
        weight[20] = "Heavyweight";
        weight[21] = "Featherweight";
        weight[22] = "Heavyweight";
        weight[23] = "Middleweight";
        weight[24] = "Middleweight";
        weight[25] = "Middleweight";
        weight[26] = "Middleweight";
        weight[27] = "Middleweight";
        weight[28] = "Heavyweight";
        weight[29] = "Featherweight";
        weight[30] = "Balloonweight";
        weight[31] = "Heavyweight";
        weight[32] = "Heavyweight";
        weight[33] = "Heavyweight";
        weight[34] = "Featherweight";
        weight[35] = "Middleweight";
        weight[36] = "Featherweight";
        weight[37] = "Middleweight";
        weight[38] = "Middleweight";
        weight[39] = "Middleweight";
        weight[40] = "Featherweight";
        weight[41] = "Middleweight";
        weight[42] = "Heavyweight";
        weight[43] = "Middleweight";
        weight[44] = "Featherweight";
        weight[45] = "Middleweight";
        weight[46] = "Heavyweight";
        weight[47] = "Heavyweight";
        weight[48] = "Featherweight";
        weight[49] = "Heavyweight";
        weight[50] = "Middleweight";
        weight[51] = "Middleweight";
        weight[52] = "Middleweight";
        weight[53] = "Heavyweight";
        weight[54] = "Middleweight";
        weight[55] = "Heavyweight";
        weight[56] = "Featherweight";
        weight[57] = "Featherweight";


        String[] fallspeed = new String[58];
        fallspeed[0] = "Fast";
        fallspeed[1] = "Slow";
        fallspeed[2] = "Fast";
        fallspeed[3] = "Fast";
        fallspeed[4] = "Slow";
        fallspeed[5] = "Fast";
        fallspeed[6]= "Fast";
        fallspeed[7] = "Medium";
        fallspeed[8] = "Fast";
        fallspeed[9] = "Medium";
        fallspeed[10] = "Medium";
        fallspeed[11] = "Medium";
        fallspeed[12] = "Fast";
        fallspeed[13] = "Fast";
        fallspeed[14] = "Medium";
        fallspeed[15] = "Fast";
        fallspeed[16] = "Fast";
        fallspeed[17] = "Slow";
        fallspeed[18] = "Fast";
        fallspeed[19] = "Slow";
        fallspeed[20] = "Medium";
        fallspeed[21] = "Fast";
        fallspeed[22] = "Fast";
        fallspeed[23] = "Slow";
        fallspeed[24] = "Medium";
        fallspeed[25] = "Slow";
        fallspeed[26] = "Medium";
        fallspeed[27] = "Medium";
        fallspeed[28] = "Fast";
        fallspeed[29] = "Fast";
        fallspeed[30] = "Medium";
        fallspeed[31] = "Medium";
        fallspeed[32] = "Slow";
        fallspeed[33] = "Fast";
        fallspeed[34] = "Slow";
        fallspeed[35] = "Slow";
        fallspeed[36] = "Slow";
        fallspeed[37] = "Slow";
        fallspeed[38] = "Slow";
        fallspeed[39] = "Slow";
        fallspeed[40] = "Medium";
        fallspeed[41] = "Medium";
        fallspeed[42] = "Medium";
        fallspeed[43] = "Medium";
        fallspeed[44] = "Slow";
        fallspeed[45] = "Fast";
        fallspeed[46] = "Medium";
        fallspeed[47] = "Slow";
        fallspeed[48] = "Fast";
        fallspeed[49] = "Medium";
        fallspeed[50] = "Medium";
        fallspeed[51] = "Slow";
        fallspeed[52] = "Slow";
        fallspeed[53] = "Medium";
        fallspeed[54] = "Slow";
        fallspeed[55] = "Slow";
        fallspeed[56] = "Slow";
        fallspeed[57] = "Fast";


        String[] players = new String[58];
        players[0] = "Salem, Captain Zack, Mistake, 9B, Pink Fresh";
        players[1] = "Nairo, DeluxeMenu, LordMix";
        players[2] = "Tweek, Jade";
        players[3] = "Fatality, Cashmere, Ntarps";
        players[4] = "MkLeo, Sharpyzard, SilentDoom";
        players[5] = "MkLeo, Tweek, Komorikiri, Mr. R, Ned, Javi, Mew2King, ANTi, Blacktwins";
        players[6]= "Ryuga, Cosmos, MkLeo";
        players[7] = "Earth";
        players[8] = "Zero, MVD, Zinoto, Edge, Nietono";
        players[9] = "Tweek, Larry Lurr, Konga, HIKARU";
        players[10] = "B7Games";
        players[11] = "Raito, You3, Brood";
        players[12] = "Larry Lurr, XZAX, ZD, Light, NAKAT";
        players[13] = "Keitaro, AC";
        players[14] = "8 Inches, Rickles, Bizarro Flame";
        players[15] = "IceArrow, iStudying, Oisiitofu, Some, Elaxiao";
        players[16] = "Ryo, Izaw,  Ryuga";
        players[17] = "LeeT, MASTER PUFFY";
        players[18] = "Girthquake, Big D";
        players[19] = "MrRyanNess, Poyo, Triple R, K.I.D.Goggles";
        players[20] = "T, Scizor, Izaw, Slenderman, Tsage";
        players[21] = "CagT, Sol, Vash, Lazyboredom, Pu55yk1ng";
        players[22] = "Marss, MkLeo, Tsu-, Gomamugitya";
        players[23] = "Mekos, Taiheita";
        players[24] = "Mr. E, Zero, Nairo, Pugwest";
        players[25] = "Elegant, Mr. ConCon, Ron, Shoyo James";
        players[26] = "Anti, Zenyou, Ally";
        players[27] = "Mr. E, MkLeo, Pugwest, ";
        players[28] = "Kameme, ScAtt";
        players[29] = "Abadango, MkLeo, AC, DSS, Tyrant";
        players[30] = "Abadango, Rich Brown, WaDi";
        players[31] = "Chompy, LeeT, Nyani, Kochi";
        players[32] = "Chibo, Flama, Rom, San, Wii Twerk Trainer";
        players[33] = "BigLord, Leaf FC, LeeT, Meliodas-sama, Yikarur";
        players[34] = "Regi, Songn, KOSSismoss, GIMR";
        players[35] = "FOW, Awestin, BestNess, NAKAT, taranito, The Great Gonzalez";
        players[36] = "Shuton, Dabuz, ImHip, Logic, Myran";
        players[37] = "Sinji, Elaxiao, Kiwi, Tea";
        players[38] = "TLTC, Prince Ramen, MM";
        players[39] = "Samsora, SlayerZ, Twi, Razo, Ling Ling, Umeki, Captain Zack, Saj";
        players[40] = "ESAM, Captain L, Rideae, Nero";
        players[41] = "Earth, Chompy";
        players[42] = "Raffi-X, 8BitMan, OCEAN";
        players[43] = "Dath, Nairo, Athena, Johan, Skorpio";
        players[44] = "Dabuz, Kirihara, falln, Rayquaza07, UtopianRay, Xaltis";
        players[45] = "Hyper, Captain Levi";
        players[46] = "Locus, Trela, Venom, takera, Chanshu, PiXl, Darkshad";
        players[47] = "ESAM, IcyMist, ChoZox, Salem";
        players[48] = "Mr. R, VoiD, Vinnie, Trevonte, K9sbruce, False, Nietono, ANTi, Karna, Blank, Kameme";
        players[49] = "Nicko, Kome";
        players[50] = "Komorikiri, KEN, Wrath, 6WX, Aperture, Craftis, Manny, SuperGirlKels, Seagull Joe";
        players[51] = "Hyuga, Zan, Biddy, MJG, Ri-ma, Sigma, Xorn";
        players[52] = "Ranai, MJG, Aarvark";
        players[53] = "Gluttony";
        players[54] = "John Numbers, Captain Zack, RIN, Waveguider, WIi Twerk Trainer";
        players[55] = "Sky, Raptor, Papa Wall, Seth, Ron, Xeon";
        players[56] = "Purple Guy, Riot, ven, Fairess";
        players[57] = "Nairo, Marss, ANTi, quiK, Choco, Griffith, Luhtie, Mistake, Remzi";





        String[] pictures = new String[58];
        pictures[0] = "bayo";
        pictures[1] = "bowser";
        pictures[2] = "bowserjr";
        pictures[3] = "captainfalcon";
        pictures[4] = "charizard";
        pictures[5] = "cloud";
        pictures[6]= "corrin";
        pictures[7] = "darkpit";
        pictures[8] = "diddy";
        pictures[9] = "donkeykong";
        pictures[10] = "drmario";
        pictures[11] = "duckhunt";
        pictures[12] = "fox";
        pictures[13] = "falco";
        pictures[14] = "ganon";
        pictures[15] = "greninja";
        pictures[16] = "ike";
        pictures[17] = "puff";
        pictures[18] = "kingddd";
        pictures[19] = "kirby";
        pictures[20] = "link";
        pictures[21] = "littlemac";
        pictures[22] = "lucario";
        pictures[23] = "lucas";
        pictures[24] = "lucina";
        pictures[25] = "luigi";
        pictures[26] = "mario";
        pictures[27] = "marth";
        pictures[28] = "megaman";
        pictures[29] = "metaknight";
        pictures[30] = "mewtwo";
        pictures[31] = "miiswordfighter";
        pictures[32] = "miigunner";
        pictures[33] = "miibrawler";
        pictures[34] = "mrgnw";
        pictures[35] = "ness";
        pictures[36] = "olimar";
        pictures[37] = "pacman";
        pictures[38] = "palutena";
        pictures[39] = "peach";
        pictures[40] = "pikachupic";
        pictures[41] = "pit";
        pictures[42] = "rob";
        pictures[43] = "robin";
        pictures[44] = "rosalina";
        pictures[45] = "roy";
        pictures[46] = "ryupic";
        pictures[47] = "samus";
        pictures[48] = "sheik";
        pictures[49] = "shulk";
        pictures[50] = "sonic";
        pictures[51] = "toonlink";
        pictures[52] = "villager";
        pictures[53] = "wario";
        pictures[54] = "wft";
        pictures[55] = "yoshi";
        pictures[56] = "zelda";
        pictures[57] = "zss";




        for (int i=0;i<58;i++) {
            ContentValues values = new ContentValues(10);
            values.put("name", name[i]);
            values.put("description", desc[i]);
            values.put("tier", tier[i]);
            values.put("weight", weight[i]);
            values.put("type", type[i]);
            values.put("fallspeed", fallspeed[i]);
            values.put("players", players[i]);
            values.put("picture", pictures[i]);
            values.put("guides", guides[i]);
            values.put("guides2", guides2[i]);
            db.insert("characters", null, values);
        }


    }

    /*public String getTableAsString(SQLiteDatabase db, String tableName) {
        String tableString = String.format("Table %s:\n", tableName);
        Cursor allRows = db.rawQuery("SELECT * FROM " + tableName, null);
        if (allRows.moveToFirst()) {
            String[] columnNames = allRows.getColumnNames();
            do {
                for (String name : columnNames) {
                    tableString += String.format("%s: %s\n", name,
                            allRows.getString(allRows.getColumnIndex(name)));
                }
                tableString += "\n";
            } while (allRows.moveToNext());
        }
        return tableString;
    }*/

    public DBHelper(Context context){
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}