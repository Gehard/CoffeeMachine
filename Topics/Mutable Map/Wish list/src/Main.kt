fun makeMyWishList(wishList: Map<String, Int>, limit: Int): Map<String, Int> {
    // write here
    return wishList.filterValues { it <= limit }
}