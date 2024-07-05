import HomeHeader from "@components/layout/HomeHeader.vue";
import SignIn from "@views/auth/SignIn.vue";
import Footer from "@components/layout/Footer.vue";

export const AuthRouters = [
    {
        path: '/auth/signin',
        name: 'SignIn',
        components: {
            header: HomeHeader,
            default: SignIn,
            footer: Footer
        }
    }
]