import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Chatbot extends JFrame {
    private JTextArea chatArea = new JTextArea();
    private JPanel footerPanel = new JPanel();
    private JTextField inputField = new JTextField();
    private JButton sendButton = new JButton("Send");
    private JPanel topPanel = new JPanel();
    private ArrayList<String> userHistory = new ArrayList<>();
    private ArrayList<Integer> userResponses = new ArrayList<>();
    private boolean categorySelected = false;
    private String currentCategory = "";
    private int questionIndex = 0;
    private String[] categories = {"Mental Qualities", "Emotional Qualities", "Behavioral Qualities"};

    private String[][] questions = {
            // Mental Qualities
            {"1.Is your mind free from evil thoughts and desires?", "2.Do you have a deep understanding of spiritual truth and the nature reality?",
                    "3.Do you maintain a balanced and calm mind,unaffected by external excitements?","4.Are you honest and truthful in your words and actions?",
                    "5.Are you satisfied with what you have and do not desire for more?","6.Do you have control over your senses and emotions?",
                    "7.Do you often feel restless and excited?","8.Do you have strong desires and cravings?","9.Are you impatient and want instant gratification(satisfaction)?",
                    "10.Is your mind constantly unstable?","11.Are you highly ambitious and competitive?","12.Don't you feel yourself ignorant and lacking in knowledge?",
                    "13.Are you lazy and avoid work?","14.Do you agree with this statement 'I am not preparing for any exam but hoping to pass it.' and you are not able to take quick decisions?",
                    "15.Are you not taking control of your life or expressing your opinions?"},

            // Emotional Qualities
            {"1.Do you remain calm and peaceful even in challenging situations?","2.Are you kind and compassionate towards all beings(animals)?",
                    "3.Are you forgiving and don't hold grudes(hates)?","4.Are you patient and tolerant?","5.Do you remain unaffected by happiness and sorrow?","6.Do you become attached to material possessions and people?",
                    "7.Are you prone to anger and irritability?","8.Do you agree with this sentence 'A person may feel jealous if his friend  gets the thing he wanted'?",
                    "9.Do you agree with this statement,'A person who always brags(showoff) about himself and ignores others is an arrogant person'?","10.Are you  dissatisfies and disappointed in life?",
                    "11.Are you scared and timid(cowardly) about anything in life?","12.Do you agree with  this statement,'Losing a loved one can make you feel very sad, angry and confused'?"},


            // Behavioral Qualities
            {"1.Do you perform your duties without attachment to the results?","2.Do you like to live a simple and organized life?",
                    "3.Are you disciplined and follow a routine?","4.Do you agree with the statement,'Any battle can be won with non-violence'?",
                    "5.Do you agree with the statement,'Being present and appreciating the present'?","6.Do you engage in spiritual practices like meditation,sports and yoga?",
                    "7.Are you highly active and involved in many activities?","8.Do you tend to,'Buy something on impulse(quickly) without thinking about whether it is necessary or affordable'?",
                    "9.Do you also keep room.'A messy room with clothes scattered everywhere'?","10.Do you also spend hours playing video games , using phone and ignoring other responsibilities?",
                    "11.Do you like to bathe every day except for any disease day?","12.Are you undisciplined and lack of self-control?","13.Do you agree with the statement,'A student who cheats in an examination'?",
                    "14.Do you become violent and harm other over small matters?"}
    };

    private String[][] answers = {

            // Mental Qualities

            {"1 If your mind is free from evil thoughts and desires, it means you have cultivated a deep sense of inner peace and self-awareness. You have likely developed habits that support mental clarity and tranquility, which leads to better emotional regulation and overall well-being. This state of mind allows you to focus on higher pursuits and positive thoughts, fostering personal growth and a harmonious life.\n" +
                    "\n" +
                    "Mindful Practices: Continue strengthening your positive mindset by engaging in mindfulness exercises, such as meditation or journaling, to keep your mind clear and focused on good intentions.\n" +
                    "\n"+ "Promote Positivity: Surround yourself with uplifting and encouraging people who share similar values, which will reinforce your mindset and help maintain this mental purity.\n" +
                    "\n"+"Strengthen Spirituality: Consider engaging in spiritual practices or philosophical teachings that encourage the development of positive thoughts, such as selfless service, compassion, and empathy for others.\n",
                    "2 Having a deep understanding of spiritual truth and the nature of reality suggests that you have explored beyond the surface of everyday life and are seeking a deeper connection with the world around you. This level of understanding can lead to a greater sense of peace, purpose, and alignment with your true self. It shows that you are able to see life through a broader lens, with compassion and empathy for others.\n" +
                            "\n" +
                            "Deepen Your Understanding: Continue your journey of spiritual exploration. There is always more to learn, whether through spiritual practices like meditation, reading philosophical texts, or discussing ideas with like-minded individuals.\n" +
                            "Live with Awareness: Use your knowledge to live consciously and in harmony with others. Be mindful of your thoughts, actions, and how they affect the world around you.\n" +
                            "Teach and Share: Share your spiritual insights with others in a compassionate way. Teaching and guiding others can further deepen your own understanding and help you learn even more.\n",
                    "3. Maintaining a balanced and calm mind amidst external excitements demonstrates a high level of emotional intelligence and mental discipline. It shows that you have control over your reactions, regardless of the circumstances, and that you are able to stay focused on what matters most. This ability to remain calm even in turbulent situations is a powerful tool for navigating the challenges of life with grace and ease.\n" +
                            "\n" +
                            "Regular Meditation: Continue your practice of meditation to keep your mind centered and calm. Meditation helps train the mind to respond calmly rather than react impulsively.\n" +
                            "Embrace Stability: Cultivate habits that promote mental stability, such as regular exercise, healthy eating, and sufficient sleep. These physical practices have a profound impact on your emotional and mental well-being.\n" +
                            "Surround Yourself with Calmness: Stay away from situations or people that stir up unnecessary stress or chaos. Instead, surround yourself with peaceful environments and individuals who encourage calmness and positive energy.\n",
                    "4. Being honest and truthful in your words and actions signifies that you have integrity and live authentically. It means that your actions align with your values, and you don’t compromise on your principles for personal gain or convenience. Living with honesty fosters trust in your relationships and enhances your sense of self-respect.\n" +
                            "\n" +
                            "Continue Living Authentically: Keep upholding your integrity by staying true to your values. Your honesty will continue to strengthen relationships and build a reputation of trustworthiness.\n" +
                            "Encourage Open Communication: Encourage open and honest communication in all your relationships. Be transparent with others and create an environment where truth is valued.\n" +
                            "Reflect on Your Values: Regularly reflect on your personal values and how your actions align with them. This ensures that you continue to live truthfully and authentically.\n",
                    "5.Being satisfied with what you have reflects contentment and gratitude. It means you appreciate the present moment and the blessings in your life, which is the foundation for lasting happiness. This sense of satisfaction allows you to live with peace and avoid the constant craving for more possessions or achievements.\n" +
                            "\n" +
                            "Maintain Gratitude: Continue practicing gratitude every day. Keep a gratitude journal where you write down the things you’re thankful for, no matter how small.\n" +
                            "Enjoy Simplicity: Embrace the simple joys of life, such as time spent with loved ones or enjoying nature. Avoid the trap of constantly seeking more material possessions.\n" +
                            "Focus on Inner Fulfillment: Shift your focus from external achievements to internal growth. Cultivate self-acceptance and peace, knowing that true satisfaction comes from within.\n ",
                    "6. If you have control over your senses and emotions, it means you’ve developed a high level of emotional intelligence. This allows you to respond to situations thoughtfully, rather than reacting impulsively. Emotional control leads to better decision-making and enhances your ability to navigate complex situations with clarity.\n" +
                            "\n" +
                            "Maintain Emotional Regulation: Continue practicing emotional regulation techniques such as mindfulness, meditation, or breathing exercises to keep your emotions in check in high-stress situations.\n" +
                            "Self-Reflection: Regular self-reflection allows you to understand the triggers of your emotions and how to deal with them constructively. This practice deepens emotional awareness and helps you react with balance and poise.\n" +
                            "Healthy Boundaries: Ensure you set healthy boundaries to protect your emotional well-being. This helps avoid situations that might overwhelm or destabilize your emotional state.\n",
                    "7.If you often feel restless and excited, it may indicate an overactive mind or unfulfilled needs. It could be a sign of impatience or a desire for stimulation. While excitement can be a source of motivation, excessive restlessness can create mental exhaustion or hinder productivity.\n" +
                            "\n" +
                            "Channel Restlessness Productively: Use your excitement as a motivational tool. Channel this energy into activities such as creative projects, learning something new, or setting and achieving goals.\n" +
                            "Engage in Grounding Practices: Activities like yoga, meditation, or nature walks can help calm your mind and ground your emotions, balancing restlessness with peace.\n" +
                            "Create a Balanced Routine: Having a structured daily routine that includes time for both high-energy activities and periods of rest can help manage and release excess excitement.\n ",
                    "8.Having strong desires and cravings indicates that you are passionate and driven, which can be powerful for achieving your goals. However, unchecked cravings can lead to dissatisfaction and impulsive behavior if they are not properly managed.\n" +
                            "\n" +
                            "Cultivate Mindful Desire: Practice mindfulness to assess whether your cravings are rooted in genuine needs or external pressures. This helps you develop a healthier relationship with desire.\n" +
                            "Set Intentional Goals: Channel your desires into clear, actionable goals. By focusing your energy on meaningful pursuits, you will achieve fulfillment and prevent overindulgence.\n" +
                            "Balance Your Desires: Learn to differentiate between fleeting desires and long-term goals. Not all cravings need to be fulfilled, and moderation is key to preventing frustration or burnout.\n ",
                    "9. Being impatient and seeking instant gratification can result in temporary pleasure but lead to long-term dissatisfaction. This mindset can hinder your ability to pursue deeper, more meaningful goals that require time and persistence.\n" +
                            "\n" +
                            "Practice Delayed Gratification: Start by setting long-term goals and working towards them patiently. Remind yourself that the best results often come from consistent effort and time.\n" +
                            "Develop Patience: Engage in activities that require patience, such as long-term projects, learning new skills, or cultivating hobbies. These experiences will help you understand the value of waiting for rewards.\n" +
                            "Mindfulness Practices: Incorporating mindfulness and meditation can help you manage your impatience. By focusing on the present moment, you become less reliant on instant rewards.\n ",

                    "10. If your mind is unstable, it indicates a need for balance and stability in your life. Mental instability can arise from emotional turbulence, stress, or overthinking. Regaining mental stability requires a holistic approach to nurturing your well-being.\n" +
                            "\n" +
                            "Establish Routine: Create a regular routine that incorporates time for work, rest, and self-care. Routine can help bring structure to an unstable mind.\n" +
                            "Seek Inner Peace: Engage in practices that help you find inner peace, such as meditation, yoga, or mindfulness. These techniques promote clarity and calmness.\n" +
                            "Seek Professional Help: If mental instability is overwhelming, consider speaking to a therapist or counselor who can guide you through managing stress, anxiety, or other emotional challenges.\n ",
                    "11. Being highly ambitious and competitive indicates a strong drive and desire to succeed. While this can be a source of motivation, it’s important to maintain balance and not let ambition overwhelm your mental or emotional well-being.\n" +
                            "\n" +
                            "Set Clear Goals: Channel your ambition into specific, achievable goals that push you forward. Break your larger ambitions into smaller steps to ensure steady progress.\n" +
                            "Maintain Healthy Competition: Use competition to motivate yourself, but avoid comparing yourself negatively to others. Focus on your own growth and improvement.\n" +
                            "Avoid Burnout: High ambition can lead to stress if not managed properly. Make sure to schedule breaks and practice self-care to prevent burnout.\n ",
                    "12. If you feel ignorant or lacking in knowledge, it suggests that you may be feeling uncertain about your understanding of certain aspects of life. However, acknowledging this is the first step toward growth and learning. Recognizing the need for more knowledge is a sign of self-awareness and a willingness to improve.\n" +
                            "\n" +
                            "Embrace Lifelong Learning: Understand that everyone is continuously learning and growing. You can expand your knowledge by reading books, attending seminars, or taking courses in areas that interest you.\n" +
                            "Ask Questions: Don’t be afraid to ask questions. The more you seek answers, the more you broaden your understanding. Seek out experts, mentors, or peers who can help guide you in your learning journey.\n" +
                            "Self-Compassion: Be kind to yourself during the process. It’s natural to feel like there’s always more to learn, and that’s part of the excitement of life. Accept that growth is continuous and requires patience. \n ",
                    "13. If you are lazy and tend to avoid work, it may suggest a lack of motivation, feelings of overwhelm, or avoidance due to fear of failure. While everyone feels lazy at times, chronic avoidance can hinder your progress and lead to feelings of guilt or unfulfillment.\n" +
                            "\n" +
                            "Set Small, Achievable Goals: Begin by setting small, manageable goals that you can accomplish with ease. This will help build momentum and reduce feelings of being overwhelmed.\n" +
                            "Develop a Routine: Establishing a daily routine can help overcome laziness by giving structure to your day and making work a habit rather than a chore.\n" +
                            "Motivate Yourself with Rewards: Reward yourself after completing tasks, whether big or small. This will give you something to look forward to and encourage you to stay productive.\n",
                    "14. If you resonate with the statement \"I am not preparing for any exam but hoping to pass it\" and struggle with making quick decisions, it suggests a passive approach to challenges and decision-making. This mindset may stem from a lack of preparation, fear of failure, or a tendency to procrastinate.\n" +
                            "\n" +
                            "Start Preparing Early: Instead of relying on hope, develop a habit of preparation. Break down tasks into smaller, manageable chunks, and start early. Preparation helps reduce anxiety and improves your chances of success.\n" +
                            "Improve Decision-Making Skills: Practice making small decisions quickly to build confidence. Start by choosing between simple options and work your way up to more significant decisions.\n" +
                            "Seek Support or Mentorship: Sometimes, quick decision-making becomes easier when you have someone to discuss options with. Seeking advice or mentoring can help you make decisions faster and more confidently.\n",
                    "15. If you are not taking control of your life or expressing your opinions, it may suggest feelings of powerlessness, fear of judgment, or lack of confidence. This can lead to frustration and dissatisfaction as you may feel like life is happening to you, rather than you actively shaping it.\n" +
                            "\n" +
                            "Start Small: Begin by taking small steps to take control of your life. This could be as simple as making decisions about your daily routine or asserting your preferences in conversations.\n" +
                            "Express Yourself: Practice expressing your opinions, even in small, low-stakes situations. Gradually increase your confidence in sharing your thoughts with others.\n" +
                            "Seek Support: If you struggle with confidence, consider working with a therapist or coach who can help you develop the skills and mindset necessary to take control of your life and voice your opinions.\n"},


            // Emotional Qualities

            {"1.Remaining calm and peaceful in challenging situations shows emotional maturity and strong self-regulation skills. This quality allows you to think clearly, respond thoughtfully, and maintain positive relationships under pressure. It highlights your resilience and adaptability, essential for personal growth and success.\n" +
                    "Mindful Practices: Practice mindfulness techniques such as deep breathing and progressive muscle relaxation to keep calm.\n" +
                    "Promote Positivity: Be a source of encouragement by sharing your strategies for staying composed with others.\n" +
                    "Strengthen Resilience: Reflect on past challenges to understand how your calmness led to positive outcomes.",
                    "2.Your kindness and compassion toward all beings demonstrate a profound sense of empathy and interconnectedness. This quality helps foster trust, reduce suffering, and create harmony in the world. By extending your care to animals, you set an example of ethical living and inspire others.\n" +
                            "Mindful Practices: Engage in acts of kindness such as volunteering at animal shelters.\n" +
                            "Promote Positivity: Educate your community about the importance of compassion through campaigns or social media.\n" +
                            "Strengthen Advocacy: Learn more about animal welfare and sustainable practices to align your lifestyle with your values.\n" +
                            "\n",
                    "3.Forgiving others showcases your strength to let go of negativity and focus on inner peace. It reflects emotional maturity and the ability to prioritize your mental well-being over lingering resentment. Forgiveness strengthens relationships and fosters a healthier, happier life.\n" +
                            "Mindful Practices: Reflect on how forgiveness has positively impacted your mental health and relationships.\n" +
                            "Promote Reconciliation: Encourage others to resolve conflicts by sharing your experiences.\n" +
                            "Strengthen Emotional Freedom: Use meditation to reinforce your forgiving mindset.",
                    "4.Patience and tolerance reflect your ability to adapt and understand others. These traits help you navigate life’s challenges, build stronger relationships, and maintain inner peace, even in trying circumstances.\n" +
                            "Mindful Practices: Develop these traits further through activities requiring persistence, such as gardening or long-term projects.\n" +
                            "Promote Inclusivity: Engage with people from diverse backgrounds to enhance your understanding.\n" +
                            "Strengthen Understanding: Reflect on moments where your patience led to positive outcomes.",
                    "5.Staying balanced in the face of happiness and sorrow shows emotional stability and wisdom. It indicates that you understand life’s impermanence and can navigate ups and downs with grace, focusing on what truly matters.\n" +
                            "Mindful Practices: Practice gratitude to appreciate joyful moments without becoming overly attached.\n" +
                            "Promote Resilience: Share your insights about balance with those struggling to manage emotions.\n" +
                            "Strengthen Awareness: Engage in mindfulness exercises to remain centered during emotional highs and lows.",
                    "6.Attachment to possessions and people shows your value for relationships and stability. While it reflects emotional depth, finding a balance ensures that you remain adaptable and resilient during change.\n" +
                            "Mindful Practices: Cultivate gratitude for your relationships and possessions while embracing impermanence.\n" +
                            "Promote Moderation: Focus on creating memories and experiences rather than accumulating material items.\n" +
                            "Strengthen Independence: Develop hobbies that foster self-reliance and emotional freedom.\n" +
                            "\n ",
                    "7.Recognizing your tendency toward anger shows self-awareness and a willingness to grow. Redirecting this energy constructively can strengthen your relationships and emotional health.\n" +
                            "Mindful Practices: Use relaxation techniques, such as deep breathing, to manage irritation.\n" +
                            "Promote Awareness: Share your journey with others to inspire healthier responses to anger.\n" +
                            "Strengthen Emotional Regulation: Take part in courses focused on anger management.",
                    "8.Agreeing with this statement shows that you recognize jealousy as a natural human emotion. Acknowledging this can help you better understand yourself and others, leading to personal growth and healthier relationships. Recognizing jealousy allows you to address it constructively and turn it into a source of motivation or self-improvement.\n" +
                            "Mindful Practices: Reflect on your emotions when feeling jealous and identify the root cause.\n" +
                            "Promote Understanding: Use jealousy as an opportunity to celebrate others' successes and find inspiration in their achievements.\n" +
                            "Strengthen Self-Worth: Focus on your unique strengths and goals to reduce comparison with others.",
                    "9.Recognizing arrogance reflects your understanding of healthy social dynamics. It shows you value humility and empathy in relationships. Acknowledging this behavior can help you foster mutual respect and inspire positive change in those around you.\n" +
                            "Mindful Practices: Reinforce humility in your interactions and practice active listening.\n" +
                            "Promote Positive Role Models: Highlight the importance of balanced self-confidence and respect for others.\n" +
                            "Strengthen Leadership Skills: Lead by example by celebrating both personal and collective achievements.",
                    "10.Feeling dissatisfied reflects your awareness of areas for growth or change. This recognition can be a powerful motivator to set new goals and pursue meaningful improvements in your life. Addressing dissatisfaction constructively can lead to deeper fulfillment and purpose.\n" +
                            "Mindful Practices: Use gratitude exercises to focus on positive aspects of your life while striving for change.\n" +
                            "Promote Goal-Setting: Break down large goals into manageable steps to maintain motivation.\n" +
                            "Strengthen Optimism: Surround yourself with supportive individuals who encourage positivity and resilience.",
                    "11.Acknowledging fear shows courage and self-awareness. Facing your fears can lead to personal growth, increased confidence, and a more fulfilling life. It’s a step toward building resilience and overcoming obstacles.\n" +
                            "Mindful Practices: Use visualization techniques to imagine yourself successfully overcoming fears.\n" +
                            "Promote Courageous Action: Take small, manageable steps toward confronting fears to build confidence.\n" +
                            "Strengthen Support Systems: Lean on trusted friends, mentors, or professionals for encouragement and guidance.",
                    "12.Acknowledging fear shows courage and self-awareness. Facing your fears can lead to personal growth, increased confidence, and a more fulfilling life. It’s a step toward building resilience and overcoming obstacles.\n" +
                            "Mindful Practices: Use visualization techniques to imagine yourself successfully overcoming fears.\n" +
                            "Promote Courageous Action: Take small, manageable steps toward confronting fears to build confidence.\n" +
                            "Strengthen Support Systems: Lean on trusted friends, mentors, or professionals for encouragement and guidance."},

            // Behavioral Qualities

            {"1.Performing your duties without attachment to the results reflects a mindset of detachment and inner peace. It means you focus on the process rather than the outcome, which can reduce stress and anxiety. This approach allows you to work more effectively and maintain emotional equilibrium, as you're not bound by expectations or outcomes. It encourages self-discipline and fosters a deep sense of fulfillment, as you're dedicated to doing the right thing, irrespective of external rewards or recognition.\n" +
                            "Mindful Practices: Incorporate mindfulness in your work, focusing on the present moment and the process instead of worrying about the end result. Promote Detachment: Develop an attitude of non-attachment by reminding yourself regularly that you can control only your actions, not the outcomes. Strengthen Inner Peace: Engage in self-reflection or journaling to understand your motivations and reinforce your commitment to focusing on effort rather than results.\n" +
                            "\n",
                    "2.Living a simple and organized life often reflects clarity of mind and a deep understanding of your priorities. It allows you to minimize distractions and focus on what truly matters. A simple lifestyle can lead to greater peace of mind, less clutter, and increased productivity, enabling you to thrive in your personal and professional life. This simplicity often stems from inner contentment and a mindset that values experiences over material possessions.\n" +
                            "Mindful Practices: Continue practicing minimalism in your living and work spaces to encourage mental clarity. Promote Orderliness: Incorporate a regular cleaning schedule and decluttering practices to keep your surroundings neat and organized. Strengthen Prioritization: Continually reassess your commitments and interests, simplifying your activities and goals to align with your values.",
                    "3.Discipline and routine are key to achieving long-term success. A structured routine helps you stay on track, ensuring that you allocate time for both personal growth and responsibilities. This consistency leads to better time management, reduced stress, and increased productivity. Following a routine also reinforces self-control and helps you build momentum in all areas of life, promoting stability and balance.\n" +
                            "Mindful Practices: Continue following a daily routine to enhance your discipline. Incorporate time for self-care, productivity, and rest. Promote Consistency: Regularly evaluate your schedule to ensure it aligns with your values and goals, making necessary adjustments as you grow. Strengthen Focus: Prioritize your tasks based on importance and maintain consistency to improve discipline over time.\n" +
                            "\n",
                    "4.Believing in non-violence as a solution to conflicts demonstrates maturity and emotional intelligence. Non-violence leads to peaceful resolutions, encourages empathy, and strengthens relationships. Choosing peaceful approaches, even in the face of adversity, ensures that you remain aligned with your values, fostering positive change without causing harm to others.\n" +
                            "Mindful Practices: Practice active listening and empathy when resolving conflicts to de-escalate tense situations. Promote Peaceful Solutions: Seek peaceful alternatives in your interactions and encourage dialogue over aggression. Strengthen Emotional Intelligence: Continue developing your self-awareness and emotional control to better handle conflicts peacefully.",
                    "5.Being present and appreciating the current moment cultivates mindfulness and gratitude. This mindset helps you enjoy life to the fullest, fostering contentment and reducing stress. By focusing on the present, you can better appreciate your surroundings and the people in your life, leading to stronger connections and increased emotional well-being.\n" +
                            "Mindful Practices: Continue practicing mindfulness techniques such as meditation, deep breathing, or journaling to keep yourself grounded in the present moment. Promote Gratitude: Make it a habit to express gratitude daily, focusing on what you are thankful for in the present. Strengthen Awareness: Incorporate more moments of mindfulness into your daily life, especially during mundane tasks, to develop a deeper appreciation for the present.",
                    "6.Engaging in spiritual practices such as meditation, yoga, or physical activities helps you balance both body and mind. These practices increase your self-awareness, improve mental health, and enhance your physical well-being. They also provide clarity, reduce stress, and promote emotional stability, allowing you to align with your inner values and spiritual goals.\n" +
                            "Mindful Practices: Dedicate time daily to meditation, yoga, or sports to maintain both mental and physical well-being. Promote Spirituality: Explore different spiritual paths and engage in practices that resonate with you to deepen your connection with yourself. Strengthen Consistency: Make these practices a regular part of your routine to reap the full benefits of mind-body balance.",
                    "7.Being highly active and engaged in a variety of activities is a sign of enthusiasm, curiosity, and dedication. It means that you are constantly seeking growth, learning, and ways to contribute to the world around you. It allows you to stay engaged with life, build skills, and connect with different people and experiences.\n" +
                            "Mindful Practices: While staying active, ensure that you balance it with sufficient downtime for relaxation and mental clarity. Promote Time Management: Stay organized by creating a structured schedule to manage your activities effectively. Strengthen Focus: Focus on activities that align with your core values and long-term goals to prevent overwhelm and maintain direction.",
                    "8.Impulse buying often stems from emotional reactions or the desire for instant gratification. While it can feel satisfying in the moment, it can lead to regret and financial strain. Cultivating awareness about this habit is the first step toward making more thoughtful and intentional purchasing decisions.\n" +
                            "Mindful Practices: Implement a 24-hour waiting period before making any significant purchases to give yourself time to reflect. Promote Financial Awareness: Track your expenses and create a budget to gain control over your spending habits. Strengthen Decision-Making: Reflect on your emotional triggers for impulse buying and work on managing them through mindfulness or healthier coping mechanisms.",
                    "9.A messy room can often reflect internal disorganization or a lack of awareness regarding the benefits of a clean and tidy environment. Keeping your space cluttered might contribute to feelings of stress, confusion, or even a lack of motivation. It’s important to recognize that a cluttered space can also hinder productivity and impact your emotional well-being. Maintaining a clean environment can help create a sense of calm and increase your ability to focus.\n" +
                            "Mindful Practices: Begin by setting aside a few minutes daily to tidy up, focusing on one area at a time to avoid feeling overwhelmed. Promote Organizational Habits: Create a habit of putting things away immediately after use to prevent clutter from accumulating. Strengthen Clarity: A tidy space often reflects mental clarity, so take time to organize your environment to foster a more peaceful and productive atmosphere.",
                    "10.Spending excessive time on activities such as video games or phone use can be a form of escapism, but it can also lead to neglecting important responsibilities and personal growth. If you find yourself regularly ignoring your duties in favor of entertainment, it may indicate a lack of balance in your life. It’s important to assess the reasons behind this behavior and make adjustments to ensure you're fulfilling your responsibilities while still allowing time for leisure.\n" +
                            "Mindful Practices: Implement a schedule that balances leisure and responsibilities, setting aside specific time slots for gaming or phone use. Promote Responsibility: Make a list of priorities each day and focus on completing important tasks first before engaging in recreational activities. Strengthen Focus: Use time management techniques like the Pomodoro method, which can help you stay productive and focused while still allowing for breaks.",
                    "11.Bathing regularly is a sign of personal hygiene and self-care, contributing to both physical and mental well-being. It allows you to feel refreshed and clean, which can also improve your mood and energy levels. Maintaining daily hygiene habits helps protect against infections, promotes good health, and enhances your overall sense of self-respect and confidence.\n" +
                            "Mindful Practices: Keep up your daily hygiene routine, taking time to enjoy the process of refreshing yourself and being present in the moment. Promote Self-Care: Consider using your bathing routine as a time for relaxation, such as practicing mindful breathing or playing calming music. Strengthen Health: Ensure that your hygiene practices align with overall health goals, incorporating skincare or relaxation rituals into your routine.",
                    "12.A lack of discipline and self-control can lead to difficulties in achieving goals, maintaining relationships, and managing responsibilities. It often results in procrastination, poor decision-making, and feelings of frustration. Developing discipline is essential for achieving long-term success and personal growth, as it enables you to stay focused, meet deadlines, and maintain consistency in your actions.\n" +
                            "Mindful Practices: Implement small, manageable habits to build self-control, such as setting clear goals and tracking progress. Promote Accountability: Hold yourself accountable by setting deadlines and regularly reviewing your actions. Strengthen Motivation: Use rewards as incentives for sticking to your commitments, and remind yourself of the long-term benefits of self-discipline.",
                    "13.If you believe that cheating during an examination undermines the integrity of the educational process, it shows that you value honesty, fairness, and ethical behavior. Cheating not only harms the individual involved but also diminishes trust in the academic system. Adhering to honesty builds self-respect and allows you to earn your achievements authentically.\n" +
                            "Mindful Practices: Continue valuing honesty by setting personal academic goals that emphasize integrity rather than shortcuts. Promote Ethical Behavior: Encourage your peers to embrace honesty and fair practices in academic settings, fostering a culture of integrity. Strengthen Self-Worth: Reflect on the benefits of genuine success and the importance of ethical actions in your personal development.",
                    "14.Reacting violently to minor issues indicates a lack of emotional control and an inability to manage frustration. Such behavior can cause harm to others and strain relationships, leading to long-term consequences. Developing emotional intelligence and learning to handle conflict calmly is essential for fostering healthier interactions and reducing unnecessary aggression.\n" +
                            "Mindful Practices: Practice anger management techniques such as deep breathing, taking a pause, or stepping away from the situation to prevent rash reactions. Promote Emotional Regulation: Engage in activities like meditation or journaling to process your emotions and increase self-awareness. Strengthen Empathy: Focus on understanding other people’s perspectives and feelings, which can help reduce the urge to act impulsively."}
    };

    private String[][] solutions = {
                    // Mental Qualities

            {"1 If your mind is not free from evil thoughts or desires, it means that these thoughts may be influencing your daily life, potentially causing stress, guilt, or distraction. It is important to address this issue to regain control over your mind and mental state.\n"+
                    "\n"+
                    "Practice Meditation: Meditation is an excellent tool to gain control over negative thoughts. Techniques like focusing on your breath or using affirmations can help clear the mind of harmful thoughts.\n"
                    +"\n"+"Journaling: Writing down your thoughts and feelings can help you process them and release pent-up negativity. This can provide clarity and enable you to confront and address unhealthy desires.\n"
                    + "\n"+" Seek Guidance: If you struggle with deeply ingrained negative thoughts, consider talking to a therapist or counselor who can help you understand their origins and how to replace them with healthier mental patterns.\n"
                    ,"2 If you do not feel that you have a deep understanding of spiritual truth, it is never too late to start the journey of exploration and self-discovery. Spiritual growth is an ongoing process, and there are many paths to understanding reality on a deeper level.\n" +
                    "\n" +
                    "Start with Exploration: Begin by reading spiritual or philosophical texts that resonate with you. Explore different traditions and teachings to find what aligns with your inner sense of truth.\n" +
                    "Practice Self-Reflection: Engage in regular self-reflection through journaling, meditation, or quiet contemplation. Ask yourself profound questions about the nature of existence and your purpose in life.\n" +
                    "Seek Guidance: If you feel lost in your search for spiritual truth, consider seeking guidance from spiritual teachers, mentors, or communities who can help illuminate the path for you.\n",
                    "3.If you struggle to maintain a balanced and calm mind, it’s important to address the root causes of this restlessness to regain emotional control.\n" +
                            "\n" +
                            "Practice Mindfulness: Mindfulness practices such as deep breathing and grounding techniques can help you center your thoughts and emotions. Focus on being present in the moment to avoid being swept up in external excitement.\n" +
                            "Physical Exercise: Regular physical exercise, such as yoga, walking, or other calming activities, can reduce stress and help regulate emotional energy.\n" +
                            "Manage External Stimuli: Take breaks from overstimulating activities such as social media, loud environments, or stressful work situations. Create a routine that balances work, relaxation, and self-care.\n",
                    "4. If you are not always honest or truthful in your actions or words, it can lead to feelings of guilt, distrust, or inner conflict.\n" +
                            "\n" +
                            "Understand the Reason for Dishonesty: Examine why you may be tempted to lie or act untruthfully. Is it fear, insecurity, or a desire to avoid conflict? Understanding the underlying causes will help you address the issue effectively.\n" +
                            "Start with Small Changes: Begin practicing honesty in small, everyday situations. Over time, you will build the confidence to be more truthful, even in challenging circumstances.\n" +
                            "Seek Professional Help: If dishonesty is a recurring issue, speaking with a therapist or counselor can provide insights and strategies for overcoming the habit.\n",
                    "5. If you are not satisfied with what you have, it suggests that you may be seeking fulfillment from external sources rather than from within.\n" +
                            "\n" +
                            "Reflect on Your Desires: Take a moment to reflect on why you are dissatisfied. Are your desires rooted in societal pressures, comparison, or personal insecurities? Understanding the source of dissatisfaction will help you address it.\n" +
                            "Practice Contentment: Make a conscious effort to practice contentment. Start by appreciating the things you already have, whether it's your health, relationships, or simple comforts.\n" +
                            "Shift Your Focus: Instead of constantly focusing on what you don’t have, shift your mindset to what you can contribute to others or how you can grow personally. This will lead to a deeper sense of fulfillment.\n",

                    "6. If you struggle with controlling your senses and emotions, it may be due to stress, impulsivity, or external pressures. Regaining control is possible with consistent effort and self-awareness.\n" +
                            "\n" +
                            "Develop Mindfulness Practices: Practicing mindfulness through techniques such as deep breathing, progressive muscle relaxation, or meditation can help you stay grounded and reduce emotional reactivity.\n" +
                            "Therapy and Support: Consider seeking support from a counselor or therapist who can help you understand and manage your emotional responses in a healthier way.\n" +
                            "Mindful Decision-Making: Before reacting emotionally, pause to reflect on the situation and choose a measured, thoughtful response. This helps build emotional discipline over time.\n ",

                    "7. If you don’t often feel restless, it suggests you have a calm and balanced demeanor. However, it’s important to ensure you aren’t suppressing your natural energy or avoiding necessary changes.\n" +
                            "\n" +
                            "Embrace Healthy Stimuli: Ensure that you are engaging with life in a way that sparks positive excitement. Set goals and pursue activities that motivate you to remain energized and engaged.\n" +
                            "Evaluate for Stagnation: While calmness is beneficial, ensure you’re not becoming complacent or avoiding opportunities for personal growth or excitement. Seek activities that challenge and stimulate your mind in a positive way.\n ",

                    "8. If you do not have strong desires or cravings, it might suggest a more neutral or content state of mind. However, it can also indicate a lack of motivation or a sense of passivity.\n" +
                            "\n" +
                            "Discover Your Passions: Take time to explore new interests or goals that ignite passion within you. Setting goals and finding purpose can provide fulfillment and direction.\n" +
                            "Challenge Yourself: If you feel unmotivated, it may be a sign that you need to challenge yourself with new experiences or endeavors that can spark excitement and growth.\n",

                    "9. If you do not have a strong desire for instant gratification, it suggests you are able to focus on the long-term rewards, which is an excellent trait for personal and professional success.\n" +
                            "\n" +
                            "Maintain Your Focus: Keep cultivating your ability to delay gratification by staying focused on your long-term goals and prioritizing meaningful activities over short-term pleasure.\n" +
                            "Teach Others: Share your ability to wait for long-term rewards with others who may struggle with impatience. Being a role model can help others learn to appreciate the value of perseverance and delayed satisfaction.\n ",

                    "10. If your mind is not unstable, it means you have a certain level of mental clarity and emotional balance. It’s important to maintain this stability and continuously nurture it.\n" +
                            "\n" +
                            "Continue Healthy Practices: Keep incorporating practices like exercise, good nutrition, and adequate rest to maintain your mental stability.\n" +
                            "Reflect Regularly: Self-reflection allows you to identify any potential mental or emotional disturbances early on, enabling you to address them before they affect your overall well-being.\n ",

                    "11. If you are not highly ambitious or competitive, it could indicate that you are content with your current state. However, it is still important to have some level of drive to push for personal growth and fulfillment.\n" +
                            "\n" +
                            "Find Motivation: Explore what excites or interests you to ignite a sense of passion or purpose. Start by setting small personal goals that challenge you in a positive way.\n" +
                            "Embrace Healthy Challenges: Engage in activities or projects that push your boundaries. This helps you grow while keeping things balanced and in line with your capabilities. \n ",

                    "12. If you don’t feel ignorant and are satisfied with your level of knowledge, it means that you have a sense of confidence in your understanding. While this is great, remember that knowledge is vast, and there’s always more to explore.\n" +
                            "\n" +
                            "Keep Expanding Your Mind: Even if you feel knowledgeable, there is always room for improvement. Stay curious and continue learning to keep growing.\n" +
                            "Teach Others: Share your knowledge with others. Teaching is a great way to solidify your understanding while helping others to learn.\n" +
                            "Stay Open to New Ideas: Continue to seek out new experiences and perspectives that challenge your existing beliefs. This will help you maintain a balanced view and grow in wisdom.\n ",

                    "13. If you are not lazy and prefer to work, it suggests you have a good work ethic. However, be mindful of burnout or overworking yourself.\n" +
                            "\n" +
                            "Take Breaks: Ensure you take regular breaks to avoid fatigue. Rest is just as important as work in maintaining productivity and mental well-being.\n" +
                            "Focus on Work-Life Balance: Make time for activities outside of work that bring you joy and relaxation, so that you can recharge and maintain your motivation.\n" +
                            "Avoid Perfectionism: While working hard is important, avoid striving for perfection in everything you do. It’s better to make progress with a good effort than to delay because of fear of not being perfect.\n",

                    "14. If you disagree with the statement and can take quick decisions, it suggests that you are proactive and confident in your abilities. However, it’s important to ensure that your quick decisions are well thought out and not impulsive.\n" +
                            "\n" +
                            "Continue Refining Your Decision-Making Skills: While being able to make decisions quickly is valuable, make sure you are considering all options thoroughly. Reflect on your past decisions and learn from them.\n" +
                            "Balance Speed with Thoughtfulness: In some situations, slowing down to think things through can be beneficial. Strike a balance between decisiveness and careful consideration.\n" +
                            "Build a Decision-Making Framework: Develop a set of criteria to help guide your decisions, whether they’re based on values, data, or a specific goal. This will help you make faster, more effective choices.\n",

                    "15. If you are taking control of your life and expressing your opinions, it indicates that you are empowered and proactive in shaping your experiences. However, ensure that you are doing so in a balanced and healthy way.\n" +
                            "\n" +
                            "Continue Building Confidence: Keep reinforcing your ability to make decisions and voice your opinions. This will strengthen your self-confidence and help you navigate challenges.\n" +
                            "Be Respectful of Others: While expressing your opinions is important, remember to be considerate and respectful of others' views. Healthy communication is key to building positive relationships.\n" +
                            "Keep Setting Personal Goals: Continue taking control by setting and pursuing your personal goals. This will ensure you are continually progressing and evolving in line with your values.\n "},

            // Emotional Qualities

                    {"1.Struggling to remain calm in difficult situations can cause stress and conflict. Building this skill improves your mental health and interpersonal relationships.\n" +
                            "Practice Grounding Techniques: Use exercises like focusing on physical sensations to center yourself.\n" +
                            "Identify Triggers: Keep a journal to understand situations that challenge your composure.\n" +
                            "Seek Support: Join stress management workshops to learn practical techniques for staying calm.",
                    "2.A lack of compassion may indicate disconnection or unawareness of others’ needs. Developing empathy can enrich your relationships and make a positive impact.\n" +
                            "Start Small Gestures: Feed stray animals or donate to shelters to practice compassion.\n" +
                            "Educate Yourself: Read about animal welfare to understand their struggles and needs.\n" +
                            "Engage with Nature: Spend time in natural settings to develop a deeper appreciation for all living beings.\n" +
                            "\n",
                    "3.Holding grudges can lead to emotional exhaustion and strained relationships. Letting go of resentment can open pathways to happiness and inner peace.\n" +
                            "Practice Forgiveness: Start by forgiving small offenses and gradually work on bigger ones.\n" +
                            "Seek Guidance: Talk to a counselor to understand the roots of your grudges.\n" +
                            "Focus on Empathy: Try to see things from the perspective of the person who hurt you.\n" +
                            "\n",
                    "4.Impatience and intolerance can lead to frustration and missed opportunities. Building these qualities fosters resilience and better relationships.\n" +
                            "Start Small: Practice waiting longer for small rewards to build patience.\n" +
                            "Learn from Role Models: Observe how tolerant people handle disagreements or delays.\n" +
                            "Develop Coping Strategies: Use techniques like counting to ten before reacting to frustrating situations.",
                    "5.Being overly affected by emotions can cause instability. Developing balance helps you maintain clarity and focus during life’s challenges.\n" +
                            "Practice Mindfulness: Use techniques like body scans to ground yourself emotionally.\n" +
                            "Seek Guidance: Work with a coach or therapist to understand how to manage emotional swings.\n" +
                            "Reflect on Triggers: Analyze situations that cause extreme emotional reactions to develop coping strategies.",
                    "6.Lack of attachment might suggest independence but could also hinder emotional connections. Appreciating meaningful bonds enriches your life.\n" +
                            "Nurture Relationships: Invest time in meaningful connections to build trust and intimacy.\n" +
                            "Practice Gratitude: Reflect on the people and possessions that bring you joy.\n" +
                            "Seek Balance: Engage in activities that blend emotional connection with self-sufficiency.\n" +
                            "\n",
                    "7.A calm temperament reflects emotional control and stability. However, avoid suppressing necessary emotions, as they may lead to unresolved conflicts.\n" +
                            "Encourage Healthy Expression: Learn to articulate concerns constructively.\n" +
                            "Foster Self-Awareness: Reflect on how calmness has positively impacted your relationships.\n" +
                            "Build Communication Skills: Take workshops on assertive communication to express emotions effectively.",
                    "8.Not feeling jealous may indicate emotional stability and confidence, but it’s important to remain empathetic toward those who experience it. Helping others overcome jealousy can create stronger connections.\n" +
                            "Encourage Open Conversations: Help friends or family members express and resolve feelings of jealousy.\n" +
                            "Promote Gratitude: Share strategies to foster contentment and gratitude for personal achievements.\n" +
                            "Strengthen Empathy: Reflect on how others might feel in similar situations and offer support.\n" +
                            "\n",
                    "9.Disagreeing may suggest that you view such behavior as confidence rather than arrogance. However, distinguishing between the two can enhance your ability to navigate social situations effectively.\n" +
                            "Clarify Intentions: Seek to understand the motivations behind others' behavior to better assess arrogance versus confidence.\n" +
                            "Promote Constructive Feedback: Provide gentle feedback to people who might not realize their behavior affects others.\n" +
                            "Encourage Self-Awareness: Help others reflect on how their actions impact relationships.",
                    "10.Being content reflects a healthy perspective on life. However, ensuring continuous growth and preventing complacency is essential for long-term satisfaction.\n" +
                            "Encourage Lifelong Learning: Explore new hobbies or skills to enrich your life.\n" +
                            "Promote Gratitude: Continue appreciating what you have while setting future aspirations.\n" +
                            "Strengthen Reflection: Periodically assess your goals and achievements to stay aligned with your values.\n" +
                            "\n",
                    "11.Being fearless reflects confidence and resilience. However, remaining cautious and prepared in uncertain situations ensures balanced decision-making.\n" +
                            "Encourage Empathy: Support others who struggle with fear by sharing your experiences and strategies.\n" +
                            "Promote Preparedness: Stay aware of potential risks and plan accordingly to maintain confidence.\n" +
                            "Strengthen Leadership: Use your fearless attitude to inspire and guide others through challenging situations.\n" +
                            "\n",
                    "12.Disagreeing may indicate emotional detachment or a different perspective on loss. Exploring your emotions and those of others can lead to a more empathetic understanding of grief.\n" +
                            "Practice Compassion: Offer support to those who are grieving to better connect with their experiences.\n" +
                            "Promote Reflection: Consider how past losses have shaped your perspective on life and relationships.\n" +
                            "Strengthen Connections: Build deeper relationships to foster mutual support during challenging times.\n" +
                            "\n"},


            // Behavioral Qualities


            {"1.Being overly attached to the results of your actions can lead to frustration, anxiety, and dissatisfaction. If you find yourself stressing over outcomes, it may hinder your ability to fully invest in your duties. It is crucial to let go of the need for external validation and focus on the process to experience true satisfaction.\n" +
                            "Practice Mindfulness: Try to cultivate a mindset where you focus solely on the actions you're taking rather than obsessing over the result. Promote Emotional Resilience: Practice deep breathing exercises to detach emotionally from outcomes and center your focus on your work. Strengthen Perspective: Reflect on your values and motivations to gain perspective on why you're performing your duties, reducing the desire for external rewards.\n" +
                            "\n",

                    "2.Living in a disorganized or overly complex environment can contribute to feelings of stress and overwhelm. Embracing simplicity can bring more clarity and focus into your life, reducing unnecessary distractions. Take small steps to incorporate simple practices that align with your priorities.\n" +
                            "Practice Minimalism: Start by decluttering one area of your life (like your home or schedule) and gradually adopt simplicity in other areas. Promote Focus: Limit multitasking and focus on one task at a time to reduce mental clutter. Strengthen Clarity: Organize your goals and activities into manageable steps that support a more focused and purposeful lifestyle.",

                    "3.If you struggle with discipline and maintaining a routine, it can create a sense of chaos and delay your progress in both personal and professional areas. Developing a routine helps you manage time effectively and increases your chances of achieving your goals.\n" +
                            "Practice Scheduling: Start with small, manageable tasks and set regular times to complete them, building momentum toward a routine. Promote Accountability: Hold yourself accountable by setting reminders or using planners to track your tasks and habits. Strengthen Motivation: Reflect on the benefits of a structured routine to boost your motivation to maintain discipline.",

                    "4.If you don’t agree with non-violence, it may be because of past experiences where aggressive tactics seemed to provide results. However, embracing non-violence can lead to more sustainable and harmonious outcomes in the long run.\n" +
                            "Practice Compassion: Reflect on situations where non-violence led to better outcomes and try applying those strategies. Promote Peace: Engage in conflict resolution practices that prioritize understanding and empathy over anger and retaliation. Strengthen Conflict Resolution: Take a step back in tense moments to cool down before reacting, allowing room for peaceful dialogue.",

                    "5.If you find it difficult to be present or appreciate the present moment, it may be due to stress, distractions, or the habit of overthinking. Focusing on the now can help you reduce anxiety and experience life more fully.\n" +
                            "Practice Mindfulness: Start with simple mindfulness exercises, such as paying attention to your breath or surroundings for a few minutes each day. Promote Gratitude: Focus on small, everyday moments to appreciate and reflect on what makes your life meaningful right now. Strengthen Emotional Clarity: Limit distractions such as social media or multitasking to remain present during your interactions and activities.",

                    "6.If you’re not engaged in spiritual or physical activities, it may be time to introduce simple practices that promote mental and physical health. These activities can boost your well-being and provide a sense of peace and purpose.\n" +
                            "Start Small: Introduce a short meditation or stretching routine each morning to gradually build a habit. Promote Active Living: Try engaging in any physical activity you enjoy, such as walking, swimming, or cycling, to improve your physical health. Strengthen Routine: Consistency is key—start by incorporating spiritual or physical activities into your day and gradually increase the time spent.\n" +
                            "\n",

                    "7.If you're not very active, it may be due to lack of motivation or an overwhelming schedule. However, engaging in more activities can help you discover new interests and contribute positively to your personal growth.\n" +
                            "Practice Exploration: Start by exploring new hobbies or interests that intrigue you, and make them part of your routine. Promote Balance: Add small activities into your day, such as joining a fitness class, volunteering, or pursuing a hobby, to increase engagement. Strengthen Accountability: Commit to participating in at least one new activity each week to build momentum and excitement.",

                    "8.Being thoughtful and intentional about purchases indicates strong self-control and financial awareness. This habit supports long-term financial health and reflects a clear understanding of your needs and priorities.\n" +
                            "Practice Budgeting: Continue tracking your spending and avoid impulse buys by sticking to your budget and planning purchases in advance. Promote Mindfulness: Before making a purchase, pause to reflect on whether it aligns with your values and goals. Strengthen Financial Health: Reinforce good spending habits by regularly reviewing your financial goals and making adjustments as needed.\n" +
                            "\n",

                    "9.If your room is organized and free of clutter, it shows that you value cleanliness and structure in your environment. A tidy space can help reduce stress and foster a greater sense of peace, making it easier for you to focus and feel relaxed.\n" +
                            "Practice Maintenance: Continue maintaining your space by incorporating daily cleaning habits, such as making your bed or putting away clothes. Promote Calmness: Keep your environment free from unnecessary distractions or clutter that can hinder your mental clarity. Strengthen Routine: Set a weekly schedule for more in-depth cleaning tasks, ensuring your space stays organized long-term.\n" +
                            "\n",

                    "10.If you manage your time effectively and balance leisure with responsibilities, it indicates good self-control and a healthy approach to life. Prioritizing responsibilities ensures you meet your goals while still enjoying leisure activities in moderation.\n" +
                            "Continue Prioritizing: Maintain your good habits by continuing to structure your time with an emphasis on responsibility first. Promote Healthy Boundaries: Set specific limits for phone and gaming time to maintain a healthy balance. Strengthen Focus: Regularly review your commitments to ensure that you stay on track and keep important tasks a priority.\n" +
                            "\n",

                    "11.If you're not bathing regularly, it might be due to various factors such as time constraints or a lack of understanding about the importance of hygiene. Regular bathing not only keeps you clean but also contributes to mental clarity and self-esteem.\n" +
                            "Practice Routine: Start by setting a goal to bathe daily and gradually make it a part of your regular routine. Promote Hygiene Awareness: Educate yourself on the health benefits of regular hygiene practices, which can motivate you to maintain the habit. Strengthen Health Habits: Ensure that you have a consistent morning or evening routine that includes a focus on personal hygiene and wellness.\n" +
                            "\n",

                    "12.If you are disciplined and maintain self-control, it suggests that you have a clear understanding of your goals and are committed to personal growth. This quality helps you stay consistent and focused, leading to positive outcomes in various aspects of life.\n" +
                            "Continue Practicing Discipline: Maintain your disciplined approach by setting new goals and refining your strategies for success. Promote Routine: Continue following a structured routine to enhance your focus and productivity. Strengthen Commitment: Regularly evaluate your progress to stay on track and avoid complacency.\n" +
                            "\n",

                    "13.If you disagree with this statement and believe that cheating can be justified, it may be worth examining why you hold this view. Cheating not only impacts your own growth but can also harm others and create unfair advantages.\n" +
                            "Practice Integrity: Consider how cheating could negatively affect your future and work towards embracing ethical approaches to challenges. Promote Fairness: Engage in discussions about the importance of fairness and integrity in academic settings, emphasizing the long-term value of honesty. Strengthen Character: Reflect on personal experiences where integrity led to positive outcomes and how it aligns with your long-term goals.",

                    "14.If you don’t react violently to small matters, it indicates that you have good emotional control and handle conflicts maturely. This quality contributes to healthy relationships and promotes peaceful resolutions in challenging situations.\n" +
                            "Continue Practicing Calmness: Continue to manage your emotions by remaining calm and composed in difficult situations. Promote Conflict Resolution: Practice non-violent communication to express your emotions without aggression. Strengthen Patience: Continue developing patience and empathy, ensuring that you approach every situation with a level-headed mindset."

            }
    };

    public Chatbot() {
        setTitle("PERSONALITY INVESTIGATION CHATBOT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 600);
        setLayout(new BorderLayout());

        // Chat area setup
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        // Footer panel setup with input field and send button
        footerPanel.setLayout(new BorderLayout());
        footerPanel.setPreferredSize(new Dimension(0, 60));

        inputField.setFont(new Font("Arial", Font.PLAIN, 16));
        footerPanel.add(inputField, BorderLayout.CENTER);

        sendButton.setFont(new Font("Arial", Font.BOLD, 16));
        sendButton.setPreferredSize(new Dimension(100, 60));
        footerPanel.add(sendButton, BorderLayout.EAST);

        add(footerPanel, BorderLayout.SOUTH);

        // Top panel setup for category and utility buttons
        topPanel.setLayout(new BorderLayout());

        // Left panel for utility buttons
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftPanel.setPreferredSize(new Dimension(350, 60));

        JButton feedbackButton = new JButton("Feedback");
        JButton historyButton = new JButton("History");
        JButton clearButton = new JButton("Clear");
        JButton restartButton = new JButton("Restart");

        feedbackButton.setFont(new Font("Arial", Font.PLAIN, 14));
        historyButton.setFont(new Font("Arial", Font.PLAIN, 14));
        clearButton.setFont(new Font("Arial", Font.PLAIN, 14));
        restartButton.setFont(new Font("Arial", Font.PLAIN, 14));

        feedbackButton.addActionListener(e -> showFeedbackSection());
        historyButton.addActionListener(e -> showHistory());
        clearButton.addActionListener(e -> clearChat());
        restartButton.addActionListener(e -> restartChat());

        leftPanel.add(feedbackButton);
        leftPanel.add(historyButton);
        leftPanel.add(clearButton);
        leftPanel.add(restartButton);

        topPanel.add(leftPanel, BorderLayout.WEST);

        // Right panel for category buttons
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        for (String category : categories) {
            JButton categoryButton = new JButton(category);
            categoryButton.setFont(new Font("Arial", Font.PLAIN, 14));
            categoryButton.addActionListener(e -> {
                currentCategory = category;
                categorySelected = true;
                questionIndex = 0;
                userResponses.clear(); // Clear previous responses
                reply("You selected: " + currentCategory);
                askNextQuestion();
            });
            rightPanel.add(categoryButton);
        }

        topPanel.add(rightPanel, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);

        // Action listeners for user input
        sendButton.addActionListener(e -> processInput());
        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    processInput();
                }
            }
        });

        setVisible(true);
        reply("Hi there! Please select a category from the buttons above.");

    }

    private void processInput() {
        String text = inputField.getText();
        inputField.setText("");
        chatArea.append("Self-developers --> " + text + "\n");
        userHistory.add("Self-developers --> " + text);

        if (!categorySelected) {
            reply("Hi there!,Please select a category from the buttons above.");
        } else {
            processQuestionAnswer(text);
        }
    }

    private void reply(String message) {
        chatArea.append("ChatBot --> " + message + "\n");
        userHistory.add("ChatBot --> " + message);
    }

    private void askNextQuestion() {
        if (questionIndex < questions[getCategoryIndex(currentCategory)].length) {
            reply("Question: " + questions[getCategoryIndex(currentCategory)][questionIndex]);
        } else {
            reply("You've completed the " + currentCategory + " PERSONALITY INVESTIGATION SESSION!");
            determinePersonalityType(userResponses);
            categorySelected = false;
        }
    }

    private void processQuestionAnswer(String answer) {
        int categoryIndex = getCategoryIndex(currentCategory);
        if (categoryIndex != -1 && questionIndex < answers[categoryIndex].length) {
            if (answer.equalsIgnoreCase("yes")) {
                reply("Explanation: " + answers[categoryIndex][questionIndex]);
                userResponses.add(questionIndex + 1);  // Store response for personality determination
            } else if (answer.equalsIgnoreCase("no")) {
                reply("Solution: " + solutions[categoryIndex][questionIndex]);
                userResponses.add(0);  // Store response for personality determination
            } else {
                reply("Please answer with 'yes' or 'no'.");
                return;
            }
        }

        questionIndex++;
        askNextQuestion();
    }

    private int getCategoryIndex(String category) {
        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equalsIgnoreCase(category)) {
                return i;
            }
        }
        return -1;
    }

    private void determinePersonalityType(ArrayList<Integer> responses) {
        int mentalScore = 0;
        int emotionalScore = 0;
        int behavioralScore = 0;

        // Calculate scores based on responses
        for (int response : responses) {
            if (response >= 1 && response <= 15) {
                mentalScore++;
            } else if (response >= 16 && response <= 30) {
                emotionalScore++;
            } else if (response >= 31 && response <= 45) {
                behavioralScore++;
            }
        }

        // Determine personality type based on scores
        if (mentalScore > emotionalScore && mentalScore > behavioralScore) {
            reply("Your personality type is primarily Sattiv. You are analytical and focused on intellectual pursuits.");
        } else if (emotionalScore > mentalScore && emotionalScore > behavioralScore) {
            reply("Your personality type is primarily Rajasic. You are empathetic and in tune with your feelings.");
        } else if (behavioralScore > mentalScore && behavioralScore > emotionalScore) {
            reply("Your personality type is primarily Tamasic. You are action-oriented and focused on practical outcomes.");
        } else {
            reply("Your personality type is a blend of Sattiv, Rajasic , and   Tamasic qualities. You possess a well-rounded personality.");
        }
    }

    private void showFeedbackSection() {
        String feedback = JOptionPane.showInputDialog(this, "Please provide your feedback:");
        if (feedback != null && !feedback.trim().isEmpty()) {
            reply("Thank you for your feedback!");
        } else {
            reply("No feedback provided.");
        }
    }

    private void showHistory() {
        StringBuilder history = new StringBuilder();
        for (String entry : userHistory) {
            history.append(entry).append("\n");
        }
        JTextArea historyArea = new JTextArea(history.toString());
        historyArea.setEditable(false);
        historyArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(historyArea);
        JOptionPane.showMessageDialog(this, scrollPane, "User History", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearChat() {
        chatArea.setText("");
        userHistory.clear();
        reply("Chat cleared. Hi there! Please select a category from the buttons above.");
    }

    private void restartChat() {
        chatArea.setText("");
        userHistory.clear();
        userResponses.clear();
        currentCategory = "";
        questionIndex = 0;
        categorySelected = false;
        reply("Chat restarted. Hi there! Please select a category from the buttons above.");
    }

    public static void main(String[] args) {
        new Chatbot();
    }
}