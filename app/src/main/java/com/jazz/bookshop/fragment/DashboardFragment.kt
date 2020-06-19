package com.jazz.bookshop.fragment


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jazz.bookshop.R
import com.jazz.bookshop.adapter.DashboardRecyclerAdapter
import com.jazz.bookshop.model.Book

/**
 * A simple [Fragment] subclass.
 */
class DashboardFragment : Fragment() {
    lateinit var recyclerDashboard: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    val bookList= arrayListOf(
        "P.S. I Love You",
        "The Great Gatsby",
        "Anna Karenina",
        "Madame Bovary",
        "War and Peace",
        "Lolita",
        "Middle March",
        "The Adventures of Huckleberry Finn",
        "Moby Dick",
        "The Lord Of Rings"
    )
    lateinit var recyclerAdapter: DashboardRecyclerAdapter
    val bookInfoList=arrayListOf<Book>(
        Book("P.S. I Love You","Cecelia Ahern","Rs. 229","4.5",R.drawable.ps_ily),
        Book("The Great Gatsby","F. Scott Fitzgerald","Rs.339","4.1",R.drawable.great_gatsby),
        Book("Anna Karenina", "Leo Tolstoy", "Rs. 199", "4.3", R.drawable.aanna_kare),
        Book("Madame Bovary", "Gustave Flaubert", "Rs. 500", "4.0", R.drawable.madame),
        Book("War and Peace", "Leo Tolstoy", "Rs. 249", "4.8", R.drawable.war_and_peace),
        Book("Lolita", "Vladimir Nabokov", "Rs. 349", "3.9", R.drawable.lolita),
        Book("Middlemarch", "George Eliot", "Rs. 599", "4.2", R.drawable.middlemarch),
        Book("The Adventures of Huckleberry Finn", "Mark Twain", "Rs. 699", "4.5", R.drawable.adventures_finn),
        Book("Moby-Dick", "Herman Melville", "Rs. 499", "4.5", R.drawable.moby_dick),
        Book("The Lord of the Rings", "J.R.R Tolkien", "Rs. 749", "5.0", R.drawable.lord_of_rings)
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        val view=inflater.inflate(R.layout.fragment_dashboard, container, false)
        recyclerDashboard=view.findViewById(R.id.recyclerDashboard)
        layoutManager=LinearLayoutManager(activity)
        recyclerAdapter= DashboardRecyclerAdapter(activity as Context,bookInfoList)
        recyclerDashboard.adapter=recyclerAdapter
        recyclerDashboard.layoutManager=layoutManager
        recyclerDashboard.addItemDecoration(
            DividerItemDecoration(
                recyclerDashboard.context,
                        (layoutManager as LinearLayoutManager).orientation))
        return  view
    }


}
