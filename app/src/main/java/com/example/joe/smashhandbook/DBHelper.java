package com.example.joe.smashhandbook;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static com.example.joe.smashhandbook.CharacterTemplate.TAG;

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
                        "(id integer primary key, name text, description text, tier text, type text, weight text, fallspeed text, players text)" //plus picture name or pic somehow
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
        name[52] = "Villager";
        name[53] = "Wario";
        name[54] = "Wii Fit Trainer";
        name[55] = "Yoshi";
        name[56] = "Zelda";
        name[57] = "ZSS";

        String[] desc = new String[58];
        desc[0] = "Bayonetta is easily the most controversial character in smash, and has seen a rise lately with players like salem, mistake, and captain zack doing exceptionally well. Her combos depend on reading SDI, but are some of the best, and it is easy to be creative with her combos. She has some specific mecahnics that no other character has.";
        //bat within and witch time in specific techs page
        desc[1] = "Bowser is a grappler, very similar to DK. At certain low percents, a grab with bowser means death for your opponent.";
        //tough guy properties, shell shock percentages.
        desc[2] = "Bowser Jr. is not a very common character, but high level play with him can be very fun to watch, and fun to pull off as well. idk man i dont know much abt this character";
        desc[3] = "Captain Falcon is one of the most exciting characters to watch- he has flashy combos and often relies on airdodge reads. However, his recovery is very linear and easy to interrupt.";
        desc[4] = "Charizard sucks.";
        desc[5] = "Cloud is clearly the best character in doubles, and top 3 in singles. He has amazing aerials, amazing movement options, and great mixups. His only staggering weakness is his short and linear recovery.";
        //snapping to ledge with upb - no vertical momentum
        desc[6]= "Corrin is a great juggler and good at racking up damage. Her kill power is nothing to laught at either, and she is more mobile than she seems.";
        desc[7] = "Dark Pit is the least used character in the game. There are no glaring weaknesses with Dark Pit, but there are also no glowing strengths. Dark Pit is a very honest, all-around, average character.";
        desc[8] = "Diddy is a great all around character who can be played aggressively or defensively. His meta has been pushed farther than many characters, though there are still many useful techniques not being used by diddy mains. His play centers around his banana, giving him great stage control and easy kill confirms. Watch ZeRo play to learn the basic bread and butter combos, and watch zinoto to see some unique combos and set ups.";
        desc[9] = "Donkey Kong has been on the rise lately, with HIKARU and Konga doing well, as well as Tweek and Larry using him as a secondary. He is a grappler through and through, and can kill most characters at extremely low percents. He does struggle at landing, though.";
        //include ding dong percents in specific techs page of dk. do this for other combos like toot toot, shell shock, etc. four spikes.
        desc[10] = "Dr Mario is essentially a worse version of mario, with a shorter up special, a weaker projectile, and smaller hitboxes.";
        //fact check doc
        desc[11] = "Duck Hunt is one of the most complex characters. His neutral is very good, and his meta has been developing quickly since Raito and the Japanese Duck Hunts started competing more.";
        desc[12] = "Fox is a very solid character. He is a rushdown, pressure-heavy type, with room for creative combos relying heavily on his uptilt. He can struggle to get kills, though he has more than a few kill confirms. His uptilt is exceptionally good at catching 2-frames.";
        desc[13] = "Falco is a very slow character, and so he depends on mix-ups, reads, and combos. His back air is extremely powerful, and his forward air can combo into itself. He is not a very common pick, though he has had some results in majors.";
        desc[14] = "Ganondorf is exceptionally slow, and his moves have a lot of lag. However, he has some interesting combos, and his moves hit very hard. His upsmash has deceivingly little end lag, and can catch people off guard.";
        desc[15] = "Greninja";
        desc[16] = "Ike is slow and therefore depends on mixups, footsies, and reads. However he has some basic throw combos to rack up damage, and very solid killing power in many of his moves.";
        desc[17] = "Jigglypuff is one of the worst in the game, though some don't think she belongs there. Puff has some redeeming qualities in her aerial movement, good air attacks, and highest number of jumps in the game (6). However, her ground attacks leave some to be desired. She does have true rest setups though, many of which are underused.";
        desc[18] = "King Dedede is considered by some to be the worst in the game. His movement is slow, and most of his moveset is slow as well. He has a decent projectile game with his gordos, which can also lead to some nasty ledge traps. He suffers against a large portion of the cast, though.";
        desc[19] = "Kirby is a low tier(?) character with a good amount of winning matchups. Kirby has high combo ability on fast fallers, such as fox.";
        desc[20] = "Link ";
        desc[21] = "Little Mac is definitely one of the most fun characters to play. His ground game is one of the best, and his frame data is ridiculous. He struggles, though, in the air and when recovering. For these reasons he currently has more than a few losing matchups.";
        desc[22] = "Lucario is a scary character to play against, as he has aura on his side. This means that some of his moves can start KOing at extremely early percents when he has some amount of aura.";
        //aura percents, doubles strat
        desc[23] = "Lucas";
        desc[24] = "Lucina is very similar to marth, with a few exceptions. Lucina has a slightly shorter reach, not because of the length of the sword, but because of the reach of her arm. Her sword has no tipper effect, and the entire length of it does the same amount of damage. So this makes spacing easier,but results in her not having moves as strong as marth's tippers.";
        desc[25] = "Luigi is represented at the highest level by only a single player. He has very low friction, and therefore relies heavily on power shielding for counterattacks. He has endless combos out of down throw";
        desc[26] = "Mario has some of the most exciting combos in the game. Most of them start with a down throw, though certain characters are able to break out of the typical combo chains. Therefore mario mains must mix up their combo strategies. He has decent kill power, but not a lot of true kill combos at any percent.";
        desc[27] = "Marth";
        desc[28] = "Mega Man is a very zone-based, stage-control character. His numerous projectiles make him frustrating to play against, and";
        desc[29] = "Meta Knight";
        desc[30] = "Mewtwo is a bit of a glass cannon. He has some exciting combos and he is very fun to watch. He is floaty, so can be difficult to combo, but he is also very light and will usually die very early.";
        desc[31] = "Mii Swordfighter desc";
        desc[32] = "Mii Gunner desc";
        desc[33] = "Mii Brawler desc";
        desc[34] = "Mr. G&W is 2D, and is therefore one of the lightest characters in the game. ..";
        desc[35] = "Ness has the strongest throw in the game in his back throw. He can get gimped by characters that can absorb his up special, like Rosalina or Ness/Lucas.";
        desc[36] = "Olimar";
        desc[37] = "Pac-Man is a janky character with interesting hydrant/fruit setups. He";
        desc[38] = "Palutena"; //moves with invincibility - bair, dash attack,...anything with shield
        desc[39] = "Peach is a very difficult character to play at a high level.";
        //float cancelling, odds of pulling bombs n stuff
        desc[40] = "Pikachu is a good all around character. He can be played very aggressively, and can go far off stage due to his very good recovery. His combos on fast fallers can be very extended and deal well over 50 damage.";
        desc[41] = "Pit is the same as Dark Pit, the only differences being speed and power. look up stats.";
        desc[42] = "ROB";
        desc[43] = "Robin is a slow, zoning character, whose main projectile acts differently depending on the level of charge.";
        //elthunder, thoron, etc
        desc[44] = "Rosalina and Luma require a very unique playstyle to play. Luma's moves have a ridiculous amount of base knockback, and";
        desc[45] = "Roy is traditionally a lower tier character but";
        desc[46] = "Ryu is one of the most exciting characters to use. He has long combo strings on most characters, some of which can lead to death. His dtilt and utilt lead to shoryu, and his nair combos into itself and into dair."; //street fighter inputs
        desc[47] = "Samus is not a very common character. She has a good combo game, and good kill power. Her roll is one of the slowest, and ";
        //shinespark
        desc[48] = "Sheik is no doubt a top tier character. Sheik's combos are ridiculous, as is her recovery. Her biggest downfall is probably her weight, leading to some early deaths.";
        desc[49] = "Shulk is not an easy character to play. He requires a high level of micromanaging with his monado arts, and can be played in many different styles.";
        //monado art stats
        desc[50] = "Sonic";
        desc[51] = "Toon Link is a better version of Link. He ";
        desc[52] = "Villager";
        desc[53] = "Wario's moves are slow, and ";
        desc[54] = "Wii Fit Trainer";
        desc[55] = "Yoshi is the character everyone used to think was underrated. He has never seen much success.";
        desc[56] = "Zelda is the definition of a glass cannon. Some consider her the worst in the game. There are good things about her though. Her neutral b has invincibility frames (check) and ";
        desc[57] = "ZSS";

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
        players[22] = "Marss, MkLeo, Tsu- or ~, ?, Goma";
        players[23] = "Mekos, Taiheita (sp?), ?";
        players[24] = "Mr. E, Zero, Nairo, Pugwest, ?";
        players[25] = "Elegant, Mr. ConCon?";
        players[26] = "Anti, Zenyou, Ally";
        players[27] = "Mr. E, MkLeo, Pugwest, ";
        players[28] = "Kameme, scAtt, ?";
        players[29] = "Abadango, MkLeo, ?";
        players[30] = "Abadango, Rich Brown, WaDi, ?";
        players[31] = "Mii Swordfighter";
        players[32] = "Mii Gunner";
        players[33] = "Mii Brawler";
        players[34] = "Kossismoss, Game7a1, GIMR, ?";
        players[35] = "FOW, ?";
        players[36] = "DaBuz, Shuton, ?";
        players[37] = "Pac-Man";
        players[38] = "TLTC, Prince Ramen, ?";
        players[39] = "Peach";
        players[40] = "ESAM, Captain L I think or maybe Q, Rideau, ?";
        players[41] = "Earth, ?";
        players[42] = "Raffi-X, 8Bitman, ?";
        players[43] = "Dath, Nairo, ?";
        players[44] = "DaBuz, Kirihara, falln, ?";
        players[45] = "Hyper, ?";
        players[46] = "Locus, Trela :(, Venom, Takera, 1 more";
        players[47] = "ESAM, IcyMist, 1 more";
        players[48] = "Mr. R, v0id (sp?), Nietono, Kameme, lots more";
        players[49] = "Nicko, kome, ?";
        players[50] = "Komorikiri, KEN, wrath, ?";
        players[51] = "Hyuga, MkLeo maybe, Zan, missin one";
        players[52] = "Ranai (sp?), JGH or whatever, ?";
        players[53] = "Gluttony, ?";
        players[54] = "John Numbers, Captain Zack, ?";
        players[55] = "Sky, Raptor, ?";
        players[56] = "Purple Guy, one more";
        players[57] = "Nairo, Marss, quik, choco, ?";


       /* String[] framedatalink = new String[58];
        framedatalink[0] = "link";
        framedatalink[1] = "linktwo";*/

        for (int i=0;i<58;i++) {
            ContentValues values = new ContentValues(7);
            values.put("name", name[i]);
            values.put("description", desc[i]);
            values.put("tier", tier[i]);
            //values.put("framedatalink", framedatalink[i]);
            values.put("weight", weight[i]);
            values.put("type", type[i]);
            values.put("fallspeed", fallspeed[i]);
            values.put("players", players[i]);
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
