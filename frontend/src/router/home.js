import Home from '@views/Home.vue'
import MainHeader from "@components/layout/MainHeader.vue";
import MenuBar from "@components/layout/MenuBar.vue";
import Footer from "@components/layout/Footer.vue";

export const HomeRouters = [
    {
        path: '/', name: 'Home',
        components: {
            default: Home,
            header: MainHeader,
            menu: MenuBar,
            footer: Footer
        }
    }
]